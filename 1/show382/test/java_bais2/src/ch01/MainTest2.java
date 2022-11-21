package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		// 배열 : 연관된 데이터 타입을 하나의 변수에 통으로 모아서 관리한다.
		// 길이 10 , 인덱스 9
		Human[] humans = new Human[10];

		Animal[] animals = new Animal[10];
//		animals[0] =new Human();
		// 반복문 for
		for (int i = 0; i < animals.length; i++) {
			if (i % 2 ==0) {
				animals[i]=new Human();
			}else {
				animals[i]=new Tiger();
			}
			animals[i] = new Human();
		}
		
		//for 문에 다른 형태
		// animals 배열에 길이 때문에 10번 반복하게 된다.
		//순차적으로 animals[0] ---> 주소값-->a --> animals 데이터 타입에 (즉, 휴면, 타이거 ,독수리)
		//foreach문
		for (Animal a: animals) {
			a.eating();
			a.move();
			System.out.println("--------");
		}
		
		//index for 문은 말 그대로 i 값에 접근해서 무언가를 처리 할 수 있다.
		//foreach  처음부터 끝까지 무언가를 반복시킬 때 자주 사용함
		//index for -인덱스 값으로 무언가 해야 할 때 사용하면 됩니다.
		

	}

}
