package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 준비물
// ServerSocket
// Socket
public class SocketServer {

	// 클라이언트에 연결을 받는 소켓
	ServerSocket serverSocket;
	// 실제로 스트림을 달아서 데이터를 주고 받고 하는 통신을 담당하는 프로그램
	Socket socket;
	// 스트림 달기
	BufferedReader bufferedReader;
	// 새로운 작업자(스래드가 필요하다)

		// 키보드에서 데이터를 받는 스트림이 필요하다.
		BufferedReader keyboardReader;
		// 클라이언트에 데이터를 보내기 위해 버퍼가 필요함
		BufferedWriter bufferedWriter;
	public SocketServer() {
		System.out.println("1. >>> 서버 소켓 시작 <<<");
		
		try {
			// ip주소 뒤에 11000가 불려진다.
			// ip 주소를 간단히 localhost라고 해도 알아듣는다
			serverSocket = new ServerSocket(11000);
			// 동작 --> 클라이언트 연결을 기다려!!!
			socket = serverSocket.accept();// 프로그램은 여기서 멈추고 있다.
//			System.out.println("여기 코드 내려오나요??");
			System.out.println("클라이언트 연결 완료 -> 서버측 소켓 생성 완료");
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 추가 생성
						// 키보드랑 프로그램이랑 연결(스트림)
						keyboardReader= new BufferedReader(new InputStreamReader(System.in));
						// 서버측에서 생성된 소켓에서 출력하는 스트림을 연결 하기
						bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
						
						//
						WriterThread writerThread = new WriterThread();
						Thread thread = new Thread(writerThread);
						thread.start();
			while(true) {
			String msg = bufferedReader.readLine();
			System.out.println("클리이언트로 부터 받은 메세지: " + msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
class WriterThread implements Runnable{
		
		// 약속 - 새로운 작업자가 할 일을 RUN 메서드 안에 정의
		@Override
		public void run() {
			
			while(true) {
			try {
				// 키보드 글자 입력 대기 받으면 아래로 코드 수행
				String serverKeyboardMsg = keyboardReader.readLine();
				// 클라이언트로 글자를 보냄
				bufferedWriter.write(serverKeyboardMsg + "\n");
				bufferedWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
			
			
		}
	}
	public static void main(String[] args) {
		new SocketServer();
	}

}
