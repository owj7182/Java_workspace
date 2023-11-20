package com.sh.oop.book.controller;

import com.sh.oop.book.model.vo.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book pig1 = new Book("아기 돼지 삼형제", "아기 돼지", 15000);
		System.out.println(pig1.toString());
		
		Book pig2 = new Book("아기 돼지 사형제", "돼지", 20000);
		System.out.println(pig2.toString());
		
		
		System.out.println(pig1.equals(pig2));
		
		Book pig3 = pig1.clone();
		
		System.out.println(pig1 == pig3);
		System.out.println(pig1.equals(pig3));
	}
	
	

	
	

}
