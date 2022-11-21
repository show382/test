package ch02;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 켭니다");
	}

	public abstract void drive();

	public abstract void stop();

	public void turnOff() {
		System.out.println("시동을 끕니다");
	}

	// 코드의 시나리오를 미리 정의 한다.
	// 메서드 앞에 final 이라는 키워드를 붙이면 --> 재정의 할 수 없게 만들어 버린다!!!
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
