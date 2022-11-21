package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainTest2 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");

			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println("\n끝");
		} catch (Exception e) {// 최상위 오류 클래스
			e.printStackTrace();
		}

	}

}
