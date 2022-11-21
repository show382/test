package ch03;

public class Refrigerator extends HomeAppliances {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉자고 끈다");
	}

}
