package sh.java.inheritance.car;

import java.util.Objects;

public class Car {
	private String brand;
	private String model;
	private String color;
	
	public Car() {
		super();
	}

	public Car(String brand, String model, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	/**
	 * 복사생성자
	 * @param other
	 */
	public Car(Car other) {
		this.brand = other.brand;
		this.model = other.model;
		this.color = other.color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	}

	/**
	 * equals비교에 사용한 필드기준으로 hashCode를 재생성.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(brand, model);
	}
	
	/**
	 * 필드값 brand, model기준으로 equals override
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model);
	}
	
	/**
	 * 오버라이드 규칙
	 * 1. 부모 메소드 시그니쳐 동일
	 * 2. 접근제한자를 더 개방하는쪽으로 변경 (protected -> public)
	 * 3. 예외던지기 구문을 축소(일부제거)
	 * 4. 공변반환타입 허용 - 리턴타입을 자식타입으로 변환 가능
	 */
	@Override
//	protected Object clone() throws CloneNotSupportedException {
	public Car clone() {
//		return new Car(this.brand, this.model, this.color);
		// 복사생성자
		return new Car(this);
	}
	
	
}
