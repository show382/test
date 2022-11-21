package ch01;

public class Tiger extends Animal{

	//필요하다면 재정의 하면 된다
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 움직입니다.");
	}
	
	//재정의 하다
	@Override
	public void eating() {
		System.out.println("날카로운 이빨로 물어 뜯다.");
	}
	
	
}
