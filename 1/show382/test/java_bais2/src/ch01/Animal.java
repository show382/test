package ch01;

public abstract class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	//추상 메서드  - 메서드의 선언부만 있고 몸체 구현부는 존재하지 않는다.
	//추상 클래스 - 추상 메서드를 포함하고 있으면 반드시 추상 클래스로 만들어 주어야 한다.
	
	public abstract void eating() ;
		
}
