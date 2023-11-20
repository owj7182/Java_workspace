package sh.java.polymorphism.product;

import java.time.LocalDate;

public class SmartPhone extends Product {
	private String os;
	
	private String carrier; // 통신사 

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(long code, String name, String brand, int price, LocalDate createdAt, String os, String carrier) {
		super(code, name, brand, price, createdAt);
		this.os = os;
		this.carrier = carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println(
			os + ", " + carrier
		);
	}
}
