package ch02;


//클래스에 final을 붙이면 상속을 못 하게 막는다
//method 앞에 final 을 사용하면 오버라이드를 못하게 막는다.
// variable(변수) 앞에 final 붙이면 상수 된다. 한번 초기화 하면 값을 변경 할 수 없다.
final public class ManuaCal extends Car{

	@Override
	public void drive() {
		System.out.println("붕붕이를 사람이 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("붕붕이를 사람이 브레이크를 밟습니다.");
	}

}
