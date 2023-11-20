package com.sh.collections.set.cart;

import java.util.*;

public class CartMain {
	
	public static void main(String[] args) {
		CartMain test = new CartMain();
//		test.test1();
		test.test2();
//		test.test3();
	}
	
	public void test3() {
		Set<Cart> carts = new TreeSet<>(new CartComparator());
		int count = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("입력해주세요 :  ");
			String name = sc.next();
			
			if (carts.contains(new Cart(name, count))) {
				System.out.println("이미 등록된 상품입니다.");
			}
			else {
				System.out.print("물건의 수량을 입력해주세요.");
				count = sc.nextInt();
			}
			carts.add(new Cart(name, count));
			
			System.out.println("더 담으시겠습니까? (y/n) : ");
			char yn = sc.next().charAt(0);
			if (yn != 'y') 
				break;
			
		}
//		System.out.println(carts);
//		Iterator<Cart> iter = carts.iterator();
			
//		System.out.print("출력 : ");
//		String search = sc.next();
			
//		if (carts.contains(new Cart(search, count))) {
//			while(iter.hasNext()) {
//				Cart cart  = iter.next();
//				if (cart.equals(new Cart(search, count))) 
//					System.out.printf("%s가 담겨있습니다", cart);
					
//				}
//			}
//			else {
//				System.out.println("조회한 상품이 없습니다.");
//			}
		Iterator<Cart> iter2 = carts.iterator();
		System.out.println("출력 : ");
		while(iter2.hasNext()) {
			i++;
			Cart cart = iter2.next();
			System.out.printf("%d. %s\n", i, cart);
		}
		System.out.println("----------------");
		System.out.println("총 " + i + "개의 상품이 담겨 있습니다.");
	}
	
	public void test2() {
		Set<Cart> carts = new HashSet<>();
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("입력해주세요 :  ");
			String name = sc.next();
			
			if (carts.contains(new Cart(name, count))) {
				System.out.println("이미 등록된 상품입니다.");
			}
			else {
				System.out.print("물건의 수량을 입력해주세요.");
				count = sc.nextInt();
			}
			carts.add(new Cart(name, count));
			
			System.out.println("더 담으시겠습니까? (y/n) : ");
			char yn = sc.next().charAt(0);
			if (yn != 'y') 
				break;
			
		}
//		System.out.println(carts);
		Iterator<Cart> iter = carts.iterator();
			
		System.out.print("상품을 조회하세요 : ");
		String search = sc.next();
			
		if (carts.contains(new Cart(search, count))) {
			while(iter.hasNext()) {
				Cart cart  = iter.next();
				if (cart.equals(new Cart(search, count))) 
					System.out.printf("%s가 담겨있습니다", cart);
					
				}
			}
			else {
				System.out.println("조회한 상품이 없습니다.");
			}
		
		
	}
	
	public void test1() {
		Set<Cart> carts = new HashSet<>();
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("입력해주세요 :  ");
			String name = sc.next();
			
			if (carts.contains(new Cart(name, count))) {
				System.out.println("이미 등록된 상품입니다.");
			}
			else {
				System.out.print("물건의 수량을 입력해주세요.");
				count = sc.nextInt();
			}
			carts.add(new Cart(name, count));
			
			System.out.println("더 담으시겠습니까? (y/n) : ");
			char yn = sc.next().charAt(0);
			if (yn != 'y') {
				break;
			}
			System.out.println(carts);
		}
		
	}

}
