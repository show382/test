package ch08;

public class ThreadMain2 {
	//메인 쓰래드1 -->메인 작업자
	public static void main(String[] args) {

		System.out.println("메인 작업자");
		System.out.println("START!!");
		//철수라는 작업자한테 일을 위임 시켜보자
		//작업자를 새로 생성
		SubThread sT1= new SubThread("서브워커1");
		//일을 시작하라는 명령어는 start이다!
		sT1.start();
		
		SubThread sT2= new SubThread("서브워커2");
		sT2.start();
		
		System.out.println("END!!");
	}//end of mains

}//end of class

//서브 작업자를 만드는 방법-1
//상속 Thread 받아야 한다
//위임할 일을 run 메서드 안에 작성해야 한다.!!!
class SubThread extends Thread {
	String name;
	public SubThread(String name) {
		this.name=name;
	}
	
	//약속 되어 있다
	//다른 작업자 한테 시킬 일을 run 메서드 안에 정의 해주면 된다.
	@Override
	public void run() {
		int i;
		for(i=0;i<20;i++) {
			System.out.print("name : " + name);
			System.out.print("-");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}