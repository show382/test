package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//준비물
	ServerSocket serverSocket; //포트 번호가 필요하다.
	Socket socket;
	BufferedReader socketReader; // 소켓 입력 스트림
	BufferedWriter bufferedWriter; // 소켓 출력 스트림
	BufferedReader keyboardReader; // 키보드 전용

	public Server() {
		initData();
		inputKeyboardMsg();
		networkStart();// <--- 이코드를 수행하면 다른 작업을 못함(while이라)
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(2000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			// 키보드로 부터 입력 받아 소켓을 통해서 데이터를 출력해야 함
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inputKeyboardMsg() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						String keyboardMsg = keyboardReader.readLine();
						bufferedWriter.write(keyboardMsg + "\n");
						bufferedWriter.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();
	}

	private void networkStart() {
		try {
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String msg = socketReader.readLine();
				System.out.println("클라이언트로 온 메세제 : " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	new Server();
}
}
