package ch06;

public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// 재정의 - override
	// 필요에 의해서 재정의 할 수 있다.
	@Override
	public String toString() {

		return "[" + this.title + "]";
	}

	// equlas 메서드는 Object에 있는 메소드 이다. 필요하다면 재정의 가능하다.
	@Override
	public boolean equals(Object obj) {
		System.out.println("여기는 book 클래스 입니다");
		Book targetbook = (Book) obj;// 다운캐스팅
		if (this.title.equals(targetbook.title)) {
			return true;
		}
		return false;
	}

}
