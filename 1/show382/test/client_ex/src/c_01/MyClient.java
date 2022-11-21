package c_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	Socket socket;
	final String IP ="192.168.3.101";
	final int PORT = 11000;
	// ip주소/포트번호
	BufferedWriter bufferedWriter;//보조 스트림
	//키보드 에서 --> 프로그램으로 데이터를 받는 스트림
	BufferedReader keyboardReader; //키보드에서 오는 데이터를 받는 스트림 
	
	public MyClient() {
		System.out.println("1. 클라이언트 소켓 시작");
		// 클라이언트 역활을 하는 소켓
		// 서버 측으로 연결될 컴퓨터에 ip 주소와 포트번호를 알고 있어야 한다.
		// 크롬창에 www.naver.com:8080 과 같은 의미
		try {
			socket = new Socket(IP,PORT);
			
			//표준 입력 스트림 -- 키보드
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("키보드로 글자를 입력해 주세요");
			 String keyboardMsg = keyboardReader.readLine();
			
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bufferedWriter.write(keyboardMsg + "\n");
			bufferedWriter.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public static void main(String[] args) {
		new MyClient();
	}
}//end of class
