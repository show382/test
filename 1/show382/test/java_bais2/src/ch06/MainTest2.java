package ch06;

public class MainTest2 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "시크릿", "아론?");
		Book book2 = new Book(2, "어린왕자", "프랑스인");
		Book book3 = new Book(3, "연금술사", "양치기");
		Book book4 = new Book(4, "어린왕자", "프랑스인");
		
		//book2 book4는 물리적으로 다른 객체입니다.
		//하지만 논리적으로 책 이름과 작가 이름이 같아면 같은 객체라고 생각하고 싶다!!!
		
		//Book 클래스에 equals 메서드를 필요에 의해서 재정의 했다.
		boolean isSame = book2.equals(book4);
		System.out.println("isSame : " + isSame);
	}

}
