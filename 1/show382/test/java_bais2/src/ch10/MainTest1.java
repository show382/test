package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		MyFrame frame = new MyFrame();
		//frame.stat()://없음
		//사용방법
		Thread thread = new Thread(frame);//다형성
		
		thread.start();
		//start메서드는 run 메서드를 실행 하라!!!
		
	}

}
