package ncs.test4;

public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	public Product() {
		super();
	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getQuantity() {
		return quantity;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// 총 구매 가격 getter사용
	int getTotalBuyPrice() {
		return price * quantity;
	}
	
	// 출력 information string으로
	public String information() {
		return "상품명 : " + name + "\n" +
				"가격 : " + price + "원\n" +
				"수량 : " + quantity + "개\n" +
				"총 구매 가격 : " + getTotalBuyPrice() + "원";
	}
}
