package sh.java.polymorphism.product;

import java.time.LocalDate;

public class ProductMain {
	private Product[] products;

	public static void main(String[] args) {
		
		ProductMain main = new ProductMain();
		// Product[]에 Desktop객체, SmartPhone객체, Tv객체를 할당
		main.test1(); 
		// Product[] 순회
		// 1. Desktop인 경우, os, cpu, ram, storage 출력
		// 2. SmartPhone인 경우, os, carrier 출력
		// 3. Tv인 경우, resolution, size 출력
		main.test2(); 
		
		// Product[] 순회, 모든 상품정보 출력 (동적바인딩)
		main.test3();
		
		
		
		
		
		
	}

	private void test3() {
		for(Product product : products) {
			// 실제 자식클래스의 override된 메소드 printProductInfo가 동적바인딩에 처리!
			product.printProductInfo(); 
		}		
	}

	private void test2() {
		for(Product product : products) {
			if(product instanceof Desktop) {
				Desktop desktop = (Desktop) product;
				System.out.println(desktop.getOs());
				System.out.println(desktop.getCpu());
				System.out.println(desktop.getRam());
				System.out.println(desktop.getStorage());
			}
			else if(product instanceof SmartPhone) {
				SmartPhone smartPhone = (SmartPhone) product;
				System.out.println(smartPhone.getOs());
				System.out.println(smartPhone.getCarrier());
			}
			else if(product instanceof Tv) {
				Tv tv = (Tv) product;
				System.out.println(tv.getResolution());
				System.out.println(tv.getSize());
			}
			System.out.println("---------------------");
		}
	}

	private void test1() {
		this.products = new Product[] {
			new Desktop(1, "삼성 집컴", "삼성", 1_000_000, LocalDate.now(), "Windows11", "i-9", 16, 1024),
			new Desktop(2, "아이맥", "애플", 2_000_000, LocalDate.now(), "macOS", "M2", 16, 1024),
			new SmartPhone(3, "갤럭시23", "삼성", 1_000_000, LocalDate.now(), "안드로이드", "SK"),
			new SmartPhone(4, "아이폰14", "애플", 1_500_000, LocalDate.now(), "iOS", "KT"),
			new Tv(5, "샤오미 롤러블tv", "샤오미", 5_000_000, LocalDate.now(), "UHD", 80),
			new Tv(6, "LG 롤러블tv", "LG", 10_000_000, LocalDate.now(), "UHD", 100)
		};
	}

}
