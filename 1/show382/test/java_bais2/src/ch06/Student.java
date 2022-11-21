package ch06;

//Object 클래스는 모든 클래스의 최상위 클래스 입니다.
//자바에서는 Object 클래스를 제외하고 단일 상속만 지원 합니다.
//extends Object라는 키워드를 작성하지 않아도 자동으로 컴파일러가 추가해 준다.
//public class Student extends Object 
//import java.lang.*;//<--직접 import 하지 않아도 자동으로 컴파일러가 추가 해주는 코드

public class Student {
	
	String string = "안녕하세요";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
