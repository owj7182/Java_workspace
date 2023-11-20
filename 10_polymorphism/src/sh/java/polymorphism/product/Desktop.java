package sh.java.polymorphism.product;

import java.time.LocalDate;

public class Desktop extends Product {
	
	private String os; 
	
	private String cpu;
	private int ram;
	private int storage;
	
	public Desktop() {}

	/**
	 * super()
	 * - 부모생성자 호출
	 * - this() 또는 super()는 생성자 맨 첫줄에 한번 반드시 호출이 되어야 한다.
	 * - 생략가능. 생략하면 자동으로 super()가 호출.
	 * - 매개인자를 전달해 필드생성자를 호출가능.
	 * 
	 * 
	 * @param code
	 * @param name
	 * @param brand
	 * @param price
	 * @param createdAt
	 * @param os
	 * @param cpu
	 * @param ram
	 * @param storage
	 */
	public Desktop(long code, String name, String brand, int price, LocalDate createdAt, String os, String cpu, int ram,
			int storage) {
		// protected 필드인 경우 직접 접근 가능
//		this.code = code; 
//		this.name = name;
//		this.brand = brand;
//		this.price = price;
//		this.createdAt = createdAt;
		
		// 부모클래스에서 물려받은 필드의 접근제한자가 private경우, 직접 접근불가
		super(code, name, brand, price, createdAt);
		
		this.os = os;
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	/**
	 * super 부모타입의 멤버에 접근하기 위한 숨은 참조
	 * - 만약 override하지 않았다면, this, super는 같다.
	 */
	@Override
	public void printProductInfo() {
		super.printProductInfo(); // Product#printProductInfo
		System.out.println(
			os + ", " + cpu + ", " + ram + ", " + storage
		);
	}

	@Override
	public String toString() {
		return "Desktop [" + super.toString() + "os=" + os + ", cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
}
