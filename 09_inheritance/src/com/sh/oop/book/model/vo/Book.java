package com.sh.oop.book.model.vo;

import java.util.Objects;

import sh.java.inheritance.car.Car;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title) && Objects.equals(author, other.author) && Objects.equals(price, other.price);
	}
	@Override
	public Book clone() {
		return new Book(this);
	}
}
