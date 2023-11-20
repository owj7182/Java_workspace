package ncs.test5;

public class Book {
	
	private String tittle;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {
		super();
	}

	public Book(String tittle, String author, int price, String publisher, double discountRate) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	String getTittle() {
		return tittle;
	}

	String getAuthor() {
		return author;
	}

	int getPrice() {
		return price;
	}

	String getPublisher() {
		return publisher;
	}

	double getDiscountRate() {
		return discountRate;
	}

	
	
}
