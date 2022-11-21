package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainTest3 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");

			int i;
			byte[] bs =new byte[10];
			
			while ((i = fis.read(bs)) != -1) {
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" i : " + i + "바이트 읽음");
//				System.out.print((char)i);
			}
			System.out.println("\n끝");
		} catch (Exception e) {// 최상위 오류 클래스
			e.printStackTrace();
		}

	}

}
