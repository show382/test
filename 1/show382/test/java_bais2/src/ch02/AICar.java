package ch02;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("붕붕이가 알아서 혼자 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("붕붕이가 알아서 멈춤니다");
	}
	

}
