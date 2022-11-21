package ch05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 문자 단위 출력 스트림 Writer 파일에 문자 쓰기-1
 *
 */
public class MainTest1 {

	public static void main(String[] args) {
		File file1 = new File("myFile.txt");//파일 자동으로 만들어주는것
		try {
			FileWriter fw = new FileWriter(file1);
			fw.write('A');//write 오버 로딩
			char buf[]= {'B','C','D'};
			fw.write(buf);
			fw.write("안녕하세요 문자열 단위도 잘 써지네요");
			
			fw.flush();//버프를 비우는것
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
