package ch06;

public class MainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "시크릿", "아론?");
		Book book2 = new Book(2, "어린왕자", "프랑스인");
		Book book3 = new Book(3, "연금술사", "양치기");
		Book book4 = new Book(4, "연금술사", "문승주");

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		
		//toString 재 정의 하는 방법
		//equals
		System.out.println(1==2);
		System.out.println("-----");
		System.out.println(book3==book4);
		//1.문자열 비교 할 때는 eqauls를 무조건 사용하자
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		String name3 = "홍길동";
		//String 재정의 되어 있다.
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1==name2);
		//문자열 비교할 때는 보통 값을 기준으로 한다.
		if(name1.equals(name2)) {
			System.out.println("같은 값입니다.");
		}else {
			System.out.println("다르다");
		}
		
	}// end of main

}// end of class
