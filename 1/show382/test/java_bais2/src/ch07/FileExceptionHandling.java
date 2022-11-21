package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		System.out.println("프로그램이 비정상 종료 안됨 !!!");
		System.out.println("---------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(" i " + i);
			if (i == 3) {
				return;// 실행에 제어권을 반납한다.
			}
		}
		
		// 단.!!!try문이 실행 되기만 하면 finally는 무조건 실행됩니다.

		// 데이터 타입 변수명= new 객체생성(); <----
		// I/O --> input ,output 입출력
		try {
			FileInputStream fis = new FileInputStream("b.txt");
			System.out.println("---------");
			System.out.println((char) fis.read());// 파일 접근해서 읽어라 라는 뜻
			System.out.println((char) fis.read());// 파일 접근해서 읽어라 라는 뜻
			System.out.println((char) fis.read());// 파일 접근해서 읽어라 라는 뜻
			System.out.println((char) fis.read());// 파일 접근해서 읽어라 라는 뜻
			System.out.println((char) fis.read());// 파일 접근해서 읽어라 라는 뜻
			return; // 실행에 종료가 됩니다. finally 는 return 보다 강하다 (우선순위 위에 있다)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행하는 영역 입니다. --> 개발자가 필요하다면 작성하는 부분 입니다.
			// 예외가 발생 하든 발생하지 않던 무조건 실행되는 영역 입니다.!!!
			System.out.println("finally 는 무조건 실행 됩니다.");
		}

	}// end of main

}// end of class
