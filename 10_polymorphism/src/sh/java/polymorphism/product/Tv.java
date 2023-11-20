package sh.java.polymorphism.product;

import java.time.LocalDate;

public class Tv extends Product {
	private String resolution; // FHD, UHD
	private int size; // 80인치
	
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tv(long code, String name, String brand, int price, LocalDate createdAt, String resolution, int size) {
		super(code, name, brand, price, createdAt);
		this.resolution = resolution;
		this.size = size;
	}
	
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println(
			resolution + ", " + size
		);
	}
	
}
