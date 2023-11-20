package sh.java.polymorphism.product;

import java.time.LocalDate;


/**
 * <pre>
 * 상속 Inheritance
 * - 부모클래스의 멤버필드/멤버메소드를 자식클래스에서 선언없이 사용하는 문법
 * - 공통(중복된) 코드 관리가 수월
 * 
 * 특징
 * 1. 모든 클래스는 Object 후손 - Object메소드를 모든 클래스에서 사용가능(equals, hashCode, toString...)
 * 2. 생성자, 초기화블럭은 상속대상이 아님.
 * 	- 자식생성자 안에서 super()로 부모생성자 호출
 * 3. 부모의 private멤버(필드/메소드)는 직접접근이 불가
 * 	- 부모클래스의 필드/메소드를 protected 접근제한자로 변경
 *  - super생성자를 통해 값세팅/setter사용도 가능
 * 4. override 메소드
 * 	- 부모메소드를 재작성
 *  - 메소드시그니쳐(접근제한자, 리턴타입, 메소드명, 매개변수, 예외)가 동일. @Override 사용할것.
 *  	- 접근제한자는 더 개방가능
 *  	- 예외선언도 제거가능
 *  - super참조를 통해 부모메소드 호출가능
 *  - private, final 메소드는 오버라이드 불가
 * 5. 자바에서는 단일상속만 가능
 * 6. final 클래스는 상속이 불가
 *  
 * 2023-09-26
 * 
 */
public class Product {
//	protected long code;
//	protected String name;
//	protected String brand;
//	protected int price;
//	protected LocalDate createdAt;
	
	private long code;
	private String name;
	private String brand;
	private int price;
	private LocalDate createdAt;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long code, String name, String brand, int price, LocalDate createdAt) {
		super();
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.createdAt = createdAt;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	public void printProductInfo() {
		System.out.print(
			code + ", " + name + ", " + brand + ", " + price + ", " + createdAt + ", "
		);
	}

	@Override
	public String toString() {
		return "code=" + code + ", name=" + name + ", brand=" + brand + ", price=" + price + ", createdAt="
				+ createdAt + ", ";
	}
	
	
	
}
