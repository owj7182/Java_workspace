package sh.java.inheritance.product;

import java.time.LocalDate;

public class ProductMain {

	public static void main(String[] args) {
		// Desktop 객체
		Desktop desktop1 = new Desktop(1, "삼성 집컴", "삼성", 1_000_000, LocalDate.now(), "Windows11", "i-9", 16, 1024);
		Desktop desktop2 = new Desktop(2, "아이맥", "애플", 2_000_000, LocalDate.now(), "macOS", "M2", 16, 1024);
		
		// SmartPhone 객체
		SmartPhone smartPhone1 = new SmartPhone(3, "갤럭시23", "삼성", 1_000_000, LocalDate.now(), "안드로이드", "SK");
		SmartPhone smartPhone2 = new SmartPhone(4, "아이폰14", "애플", 1_500_000, LocalDate.now(), "iOS", "KT");
		
		// Tv 객체
		Tv tv1 = new Tv(5, "샤오미 롤러블tv", "샤오미", 5_000_000, LocalDate.now(), "UHD", 80); 
		Tv tv2 = new Tv(6, "LG 롤러블tv", "LG", 10_000_000, LocalDate.now(), "UHD", 100);
		
		desktop1.printProductInfo();
		desktop2.printProductInfo();

		smartPhone1.printProductInfo();
		smartPhone2.printProductInfo();
		
		tv1.printProductInfo();
		tv2.printProductInfo();
		
		
		System.out.println(desktop1);
		System.out.println(desktop2);
		System.out.println(smartPhone1);
		System.out.println(smartPhone2);
		System.out.println(tv1);
		System.out.println(tv2);
		
	}

}
