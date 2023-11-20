package com.sh.oop.book.controller;

import java.util.Scanner;

import com.sh.oop.book.model.Book;

public class BookManager {
	
	private Book[] books = new Book[10];
	private Scanner sc = new Scanner(System.in);
	private int bookIndex;
	
	
	public void bookOutput() {
		String header = "제목\t가격\t할인율\t저자\t\n"
				+ "-------------------------\n";
		System.out.println(header);
		
		for (int i = 0; i < bookIndex; i++) {
			books[i].bookInformation();
		}
		System.out.println("-----------------------------");
	}
	
	public void bookInput() {
		System.out.println("책 제목 : ");
		String title = sc.next();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("할인율 : ");
		double discountRate = sc.nextDouble();
		System.out.println("저자 : ");
		String author = sc.next();
		books[bookIndex++] = new Book(title, price, discountRate, author);
	}

}
