package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainTest2 {

	public static void main(String[] args) {

		Worrior worrior = new Worrior();
		worrior.attack();
		try {
			worrior.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Worrior {

	String name;
	FileInputStream inputStream;

	public String readFile() throws FileNotFoundException {// throws던지는 경우는 사용하는 사람이 자기만의 사용법이 있을 시 던져준다.
		inputStream = new FileInputStream("c.txt");
		return "temp";
	}
public void attack() {
	System.out.println("워리어가 공격합니다");
}
}