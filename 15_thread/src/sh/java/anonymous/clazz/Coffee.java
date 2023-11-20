package sh.java.anonymous.clazz;

public class Coffee implements Product{
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	

}
