package file_io;

import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나 쓰고 엔터");

		//입력 스트림 중에 바이트 단위로 데이터를 받고 있다.
		int i;
		try {
			//키보드에서 u 라는 버튼을 누르면 바이트 단위로 데이터가 흘러 들어 온다. 117-->010101011(이런식)
			//기본적으로 데이터를 한 바이트씩 받을 수 있다.
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
