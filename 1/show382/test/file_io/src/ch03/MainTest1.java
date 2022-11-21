package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 *바이트 단위 출력
 *
 *
 */
public class MainTest1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output_b.txt",true);//true 붙이면 복붙이 된다
			fos.write('안');
			fos.write('녕');
			fos.write('반');
//			fos.write(67);
//			fos.write('D');
//			fos.write('F');
			//문자 타입으로 글자를 출력
			//Swing -- textAread, textFile <--일기장
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출력 처리 끝났음");
	}

}
