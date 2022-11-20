package kr.kreait.bookShpp;

import java.awt.print.Book;
import java.util.Date;

public class BookShop {
	public static void main(String[] args) {
		
		BookList booklist = new BookList(5);
		
//		Date data =new Data():				//현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
//		Date data =new Data(년, 월, 일):		//입력한 년, 월, 일에 해당되는 날짜를 만든다
//		날짜를 만들거나 입려가는 경우 Data 클래스는 1900년을 기준으로 처리하므로 년은 1900을 빼서 입력한다.
//		월을 입력할 때는 1을 빼서 입력해야 정상적으로 처리된다.
		BookVo book1 = new BookVo("자바", "홍길동", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book2 = new BookVo("자바", "홍길자", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book3 = new BookVo("자바", "홍길숙", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book4 = new BookVo("자바", "홍길희", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book5 = new BookVo("자바", "홍길영", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book6 = new BookVo("자바", "홍길차", "코라아출판사", new Date(2015, 5, 15), 35000);
		booklist.addBook(book1);
		booklist.addBook(book2);
		booklist.addBook(book3);
		booklist.addBook(book4);
		booklist.addBook(book5);
		booklist.addBook(book6);
		
		System.out.println(booklist);
		
	}

}
