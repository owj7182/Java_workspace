package com.sh.oop.book.controller;

import java.util.Scanner;

import com.sh.oop.book.model.Book;

public class TestBookArray {

	public static void main(String[] args) {
		
//		new TestBookArray().menu();
		TestBookArray app = new TestBookArray();
		app.menu();
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();
		String menu = "*****도서 관리 메뉴******\n"
					+ "1. 도서 정보 추가\n"
					+ "2. 모두 출력\n"
					+ "0. 끝내기\n"
					+ "**********************\n"
					+ "=> ";
		
		int selected = 0;
		
		do {
			System.out.print(menu);
			selected = sc.nextInt();
			
			switch (selected) {
			case 1 : bm.bookInput(); // 1.도서 정보 추가
				break;
			case 2 : bm.bookOutput(); // 2. 모두 출력
				break;
			case 0 : return;
			}
		}while (true);
	}
	
		// 요구사항 1번
//		Book book = new Book();
//		Book book1 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		
		// 요구사항 2번
//		book.setTitle("자바의 정석");
//		book.setPrice(35000);
//		book.setDiscount(0.1);
//		book.setAuthor("윤상섭");
		
		// 출력
//		book.bookInformation();
//		book1.bookInformation();
		
		
		
		// 요구사항 3번
		// 할인된 가격 = 가격 - (가격 * 할인율);
//		System.out.println("도서명 : " + book.getTitle());
//		System.out.println("할인된 가격 : " +(book.getPrice() - (book.getPrice() * book.getDiscountRate())));
//		System.out.println("도서명 : " + book1.getTitle());
//		System.out.println("할인된 가격 : " +(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate())));
		

	

}
