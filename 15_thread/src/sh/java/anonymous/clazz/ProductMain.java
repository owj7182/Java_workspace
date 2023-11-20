package sh.java.anonymous.clazz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductMain {

	private Product shoes = new Product() {
		private int price = 200_000;
		private String name = "나이키 조던11";
		
		
		@Override
		public int getPrice() {
			return this.price;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
	};
	
	public static void main(String[] args) {
		ProductMain main = new ProductMain();
//		main.test1();
		main.test2();
//		main.test3();
	}
	
	/**
	 * 람다표현식
	 * - 자바에서 함수형 프로그램을 지원하기 위한 문법
	 * - "추상메소드가 하나뿐인 인터페이스"를 함수형태로 객체화 할 수 있다.
	 */
	private void test3() {
//		Operator adder = new Operator() {
//			
//			@Override
//			public int calc(int a, int b) {
//				return a + b;
//			}
//		};
//		Operator adder = (int a, int b) -> {
//			return a + b;
//		};
		// 매개변수 타입 생략 가능, 메소드 바디에 리턴절 한줄만 있는 경우 {return ;} 생략가능
		Operator adder = (a, b) -> a + b;
		System.out.println(adder.calc(10, 20));
		
		Operator multiplyer = (a, b) -> a * b;
		System.out.println(multiplyer.calc(10, 20));
	}
	/**
	 * 기본정렬 : Comparable
	 * 기타정렬 : Comparator
	 */
	private void test2() {
		List<Coffee> list = new ArrayList<>();
		list.add(new Coffee("아메리카노", 2_500));
		list.add(new Coffee("라떼", 3_000));
		list.add(new Coffee("카페오레", 3_500));
		
		// 가격오름차순
//		list.sort(new Comparator<Coffee>() {
//			@Override
//			public int compare(Coffee o1, Coffee o2) {
//				return o1.getPrice() - o2.getPrice();
//			}
//		}); 
//		for(Coffee coffee : list)
//			System.out.println(coffee);
	
		// 이름 오름차순
//		list.sort(new Comparator<Coffee>() {
//			@Override
//			public int compare(Coffee o1, Coffee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		for(Coffee coffee : list)
//			System.out.println(coffee);
	
		// 람다
		Comparator<Coffee> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
		list.sort(comparator);
		list.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
		
		for(Coffee coffee : list)
			System.out.println(coffee);
	}
	
	/**
	 * 1. 필드
	 * 2. 지역변수
	 * 3. 매개인자
	 */
	private void test1() {
		System.out.printf("이 상품의 이름은 %s이고, %d원입니다.\n", shoes.getName(), shoes.getPrice());
		
		Product keyboard = new Product() {
			
			@Override
			public int getPrice() {
				return 100_000;
			}
			
			@Override
			public String getName() {
				return "기계식 적축 키보드";
			}
		};
		System.out.printf("이 상품의 이름은 %s이고, %d원입니다.\n", keyboard.getName(), keyboard.getPrice());	
		
		printProductInfo(new Product() {
			
			@Override
			public int getPrice() {
				return 1600;
			}
			
			@Override
			public String getName() {
				return "아메리카노";
			}
		});
		}
		public static void printProductInfo(Product product) {
			System.out.printf("이 상품의 이름은 %s이고, %d원입니다.\n", product.getName(), product.getPrice());
		}
}


