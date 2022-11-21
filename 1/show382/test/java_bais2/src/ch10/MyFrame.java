package ch10;

import javax.swing.JFrame;

//쓰래드를 만드는 2번째 방법
//인터페이스를 활용해서 쓰래드를 만드는 방법
public class MyFrame extends JFrame implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i + " : " + Thread.currentThread());
		}
	}
}
