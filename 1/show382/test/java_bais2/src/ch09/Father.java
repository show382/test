package ch09;

public class Father extends Thread{
	
	//의존성 컴포지션 관계
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		//입금하기
		account.saveMoney(10_000);
	}
	
}
