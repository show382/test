package ch04;

//
public  class Televsion extends HomeAppliances implements RemoteController,SoundEffect{

	public void turnOn() {
		System.out.println("티비 켠다");
	}

	public void turnOff() {
		System.out.println("티비 끈다");
	}

	@Override
	public void notification() {
		System.out.println("띠이링");
	}


	
}
