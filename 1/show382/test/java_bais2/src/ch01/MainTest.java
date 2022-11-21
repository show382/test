package ch01;

public class MainTest {

	public static void main(String[] args) {

		// 다형성 : 클래스를 다향한 형태로 바라볼 수 있다

		// 부모 타입으로 자식 객체를 생성하는 상태 --> 업 캐스팅 상태
		Animal animal1 = new Human();
		Animal animal2 = new Tiger();
		Animal animal3 = new Eagle();

		//
		animal1.move();// 사람
		animal2.move();
		animal3.move();

	}// end of main

}// end of class
