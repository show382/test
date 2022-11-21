package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			
			String msg = bufferedReader.readLine();
			System.out.println("서버측 코드 : " + msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SocketServer();
	}

}
