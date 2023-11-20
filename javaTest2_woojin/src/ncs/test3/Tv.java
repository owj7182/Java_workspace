package ncs.test3;

public class Tv {
	
	private String name;
	private int price;
	private String description;
	
	public Tv() {
	}

	public Tv(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
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

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return name + " " + price + " " + description;
	}
	
	

}
