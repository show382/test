package ch01;


//abstract - eating 재정의 하고 있다. --> 강제성이 부여 되고 있다.
public class Eagle extends Animal{
	
	@Override
	public void move() {
	System.out.println("독수리가 하늘로 날아 갑니다.");
	}
	
	
	@Override
	public void eating() {
		System.out.println("부리로 먹이를 뜯어 먹습니다.");
	}
}
