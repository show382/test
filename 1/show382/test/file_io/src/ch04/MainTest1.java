package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Reader - 입력 스트림
 * Reader 문자 단위 입력 스트림 파일에서 문자 읽기 -1
 */
public class MainTest1 {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("reader_1.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
