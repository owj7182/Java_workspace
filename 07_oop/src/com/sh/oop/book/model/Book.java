package com.sh.oop.book.model;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// title
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	// author
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	
	//price
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	// discountRate
	public void setDiscount(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	
	// 출력부
	public void bookInformation() {
		String info = title + "\t" + price +"\t" + (int)(discountRate * 100) +"%\t" + author;
		System.out.println(info);
//		System.out.printf("제목 : %s "
//				+ "상품 : %s "
//				+ "할인율 : %.1f "
//				+ "저자 : %s\n",
//				title,price, discountRate, author);
	}

}
