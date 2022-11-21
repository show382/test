package ch04;

//인터페이스 사용 방법

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("ds");
	}

	@Override
	public void turnOff() {
		System.out.println("dxfgd");
	}

	@Override
	public void notification() {
		System.out.println("dirrring");
	}
     
	}



