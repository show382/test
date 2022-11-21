package ch09;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 값입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금
	public synchronized void saveMoney(int money) {
		// 초기 금액 10만원
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금
	public synchronized void withdrawMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 방어적 코드
		if (currentMoney > money) {
			setMoney(currentMoney - money);
		} else {
			System.out.println("잔액 부족");
		}
		//9만5천원 처리 끝!!!
		System.out.println("출금 후 계좌 잔액 : " + getMoney());
	}
}
