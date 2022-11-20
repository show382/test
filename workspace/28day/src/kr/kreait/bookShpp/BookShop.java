package kr.kreait.bookShpp;

import java.awt.print.Book;
import java.util.Date;

public class BookShop {
	public static void main(String[] args) {
		
		BookList booklist = new BookList();
		
		BookVo book1 = new BookVo("자바", "홍길동", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book2 = new BookVo("자바", "홍길자", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book3 = new BookVo("자바", "홍길숙", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book4 = new BookVo("자바", "홍길희", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book5 = new BookVo("자바", "홍길영", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book6 = new BookVo("자바", "홍길차", "코라아출판사", new Date(2015, 5, 15), 35000);
		BookVo book7 = new BookVo("자바", "홍길식", "코라아출판사", new Date(2015, 5, 15), 35000);
		booklist.addBook(book1);
		booklist.addBook(book2);
		booklist.addBook(book3);
		booklist.addBook(book4);
		booklist.addBook(book5);
		booklist.addBook(book6);
		booklist.addBook(book7);
		
		System.out.println(booklist);
		
	}

}
