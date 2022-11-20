package kr.kreait.bookShpp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DefaultCaret;

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
//		DecimalFormat 클래스는 숫자의 출력 서식을 지정한다.
//		#,##0의 의미는 천 단위마다 컴마를 찍어주라는 의미이므로 무조건 적어주고 별도로 필요한 내용을 #,##0의
//		앞, 뒤로 붙여주면 된다.
//		DecimalFormat df = new DecimalFormat("#,##0");		//천 단위 컴마
//		DecimalFormat df = new DecimalFormat("￥#,##0");		//화폐 단위 컴마
//		DecimalFormat df = new DecimalFormat("#,##0%");		//백분율, 알아서 100을 곱한다.
//		DecimalFormat df = new DecimalFormat("$#,##0.00");	
		DecimalFormat df = new DecimalFormat("#,##0원");	
		return String.format("%s %s %s %s %s", title, author, publisher,sdf.format(data) , df.format(price));
	}
	
}
