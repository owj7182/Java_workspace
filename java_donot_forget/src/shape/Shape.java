package shape;

public abstract class Shape {
	private int width;
	private int height;
	private String colors;
	
	public Shape() {
		super();
	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	public abstract double getArea();

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}

	String getColors() {
		return colors;
	}

	void setColors(String colors) {
		this.colors = colors;
	}
	
	
}
