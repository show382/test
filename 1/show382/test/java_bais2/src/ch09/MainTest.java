package ch09;
	
public class MainTest {
	
	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother = new Mother(account);

		// Father --> Thread, Mother --> Thread
		// BankAccount 공유 자원으로 사용하고 있다.

		// 현재 account 10만원이 들어 있는 상태
		father.start();// 1만원 입금
		mother.start();// 5천원 출금
//		System.out.println(account.getMoney());	
		//쉐어드 리소스 상태 - 자원을 공유한 상태에 멀티 스레드 프로그래밍 일 때
		//동기화 처리를 해주어야 한다.
		//synchronized 블럭
		//synchronized 메서드
		//두가지 방법을 지원한다. 
	}
}
