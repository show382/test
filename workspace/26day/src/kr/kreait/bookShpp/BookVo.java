package kr.kreait.bookShpp;

import java.text.SimpleDateFormat;
import java.util.Date;

// 책 한 권의 정보를 기억하는 클래스
public class BookVo {
	
	private String title;   	//도서명
	private String author;		//저자명
	private String publisher;	//출판사명
	private Date data;			//출판일
	private double price;		//가격
	
	public BookVo() {}

	
	public BookVo(String title, String author, String publisher, Date data, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
		data.setYear(data.getYear()-1900);
		data.setMonth(data.getMonth()-1);
		this.data = data;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		return String.format("%s %s %s %s %.2f", title, author, publisher,sdf.format(data) , price);
	}
	
}
