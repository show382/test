package ch08;

import java.util.Iterator;

public class MyThread3 {
	//메인 쓰래드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		//1~10 main
		//최소값은 1 
		//최대값은 10
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		//서브 작업자 3개 생성
		SubThread2 t1 = new SubThread2();
		t1.setPriority(1);
		SubThread2 t2 = new SubThread2();
		SubThread2 t3 = new SubThread2();
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
//스레드 생성 방법-1
class SubThread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + ":" + Thread.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
