package ch01;

public class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("두 발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("도끼로 사냥을 해서 먹습니다.");
	}
}
