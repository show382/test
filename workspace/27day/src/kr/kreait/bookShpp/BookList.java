package kr.kreait.bookShpp;

import java.text.DecimalFormat;
import java.util.Arrays;

//  여러 권의 책 정보(BookVo)를 기억할 클래스
public class BookList {
	
	private BookVo[] booklist;			// 책 정보를 기억할 배열을 선언만 한 상태
	private int size;					// 배열의 크기
	private int count;					// 배열의 철자, 배열에 저장된 데이터의 개수
	
//	기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기르 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	public BookList() {
		this(30);
	}

public BookList(int size) {
	this.size = size;
	booklist = new BookVo[size];
}

public BookVo[] getBooklist() {
	return booklist;
}

public void setBooklist(BookVo[] booklist) {
	this.booklist = booklist;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

@Override
public String toString() {
	String str = "";
	str += "=================================\n";
	str += " 도서명 저자명 출판사명 출판일 가격 \n";
	str += "=================================\n";
	double total =0.0;
	for(int i=0;i<booklist.length ; i++) {
		if(booklist[i] ==null) {
			break;
		}
		str += booklist[i] + "\n";
		total += booklist[i].getPrice();
	
	}
	str += "=================================\n";
	DecimalFormat df = new DecimalFormat("#,##0원");
	str += " 합계 금액 : " + df.format(total) + "\n";
	str += "=================================\n";
	
	str += "=================================\n";
return 	str;
}


//  booklist에 BookVo 클래스 객체를 저장하는 메소드
 	public void addBook(BookVo book) {
// 		if를 사용하는 전통적인 예외처리
// 		if(count < size) {
// 	} else { 
// 		System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
// 	}
 		
// 		try ~ catch를 사용하는 자바의 예외(exception)처리
// 		예외가 발생될 것으로 예상되는 문장을 try 블록에 쓴다.
// 		예외가 발생하면 처리할 문장을 catch 블록에 쓴다.
// 		try 블록의 내용을 실행하다가 예외 발생하면 더 이상 try 블록을 실행하지 않고 해당 예외의 catch 블록을 실행한다.
 		try {
 		booklist[count++] = book;
 		} catch(ArrayIndexOutOfBoundsException e) {
 			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
 		} catch(Exception e) {
// 			exception 클래스는 예외의 최상위 클래스로서 모든 예외를 감지할 수 있다.
// 			catch 블록에 exception을 적을 경우 반드시 맨 마지막 catch 블록에 적어야 한다.
// 			printStackTrace(): 발생된 예외 이름과 발생된 문장을 발생 순서의 역순으로 추적한다.
 			e.printStackTrace();
 		} finally {
// 			finally 블록은 선택 사항으로서 예외 발생 여부와 관계 없이 무조건 실행해야 할 문장이 있으면 적는다.
// 			System.out.println("까꿍");
 		}

 	}

}
