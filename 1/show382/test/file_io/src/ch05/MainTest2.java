package ch05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//ip 주소 + 포트 번호로 통신을 한다.
//socket 기반으로 확장 된 개념!!! http 통신
//socket 통신을 배워 본다 다음시간에
//socket 통신이란 각각의 컴퓨터에 인터넷이 연결되어 있다면 각각 ip주소가 있다
public class MainTest2 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("myFile2.txt"));
			bw.write("File Writer Test" + "\n");//파일에 2번이 생겼다. 엔터가 실행 되어서
			bw.flush();
			//주의 점 BufferedWriter 사용시 문자에 마지막을 \n을 추가 권장한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
