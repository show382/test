package ch08;

public class ThreadMain1 {

	// 메인함수, 메인쓰래드 --> 작업자
	public static void main(String[] args) {

		System.out.println("여기는 메인 쓰래드가 동작 시켜주고 있어요~");
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				//메인쓰래드(메인 작업자) sleep -->0.5초 동안 잠들어라!!
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}// end of main

}// end of class
