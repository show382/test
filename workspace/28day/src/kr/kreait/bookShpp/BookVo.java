package kr.kreait.bookShpp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DefaultCaret;

public class BookVo {
	
	private String title;   	
	private String author;		
	private String publisher;	
	private Date data;			
	private double price;		
	
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
		DecimalFormat df = new DecimalFormat("#,##0원");	
		return String.format("%s %s %s %s %s", title, author, publisher,sdf.format(data) , df.format(price));
	}
	
}
