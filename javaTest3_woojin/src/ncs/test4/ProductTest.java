package ncs.test4;

import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		
		// 상품명
		System.out.print("상품명을 입력하세요 -> ");
		product.setName(sc.next());
		// 가격
		System.out.print("가격을 입력하세요 -> ");
		product.setPrice(sc.nextInt());
		// 수량
		System.out.print("수량을 입력하세요 -> ");
		product.setQuantity(sc.nextInt());
		
		// 출력정보
		System.out.println(product.information());
		
	}

}
