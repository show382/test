package ch06;

public class MainTest3 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "누가 내머리에 똥쌋어", "ㅎㅎ");
		Person person1 = new Person("홍길동", 10);
		Person person2 = new Person("티모", 20);
		Person person3 = new Person("홍길동", 10);
		
		//toString
System.out.println(person1);
		//equals
	boolean isSame = person1.equals(book1);
	System.out.println(isSame);
		
	}

}
