package sh.java.inheritance.shape;

import java.util.Arrays;

public class Rectangle extends Shape{
	
	private Point[] points;
	private int width;
	private int height;

	public Rectangle() {
		
	}
	
	public Rectangle (Point[] points) {
		this.points =  points;
		this.width = 200;
		this.height = 100;
	}

	public Rectangle (Point leftTop, int width, int height) {
		this.points = new Point[4];
		this.points[0] = leftTop;
		this.points[1] = new Point(leftTop.getX() + width, leftTop.getY());
		this.points[2] = new Point(leftTop.getX() + width, leftTop.getY() + height);
		this.points[3] = new Point(leftTop.getX(), leftTop.getY() + height);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle (Point leftTop, Point rightBottom) {
		this.points = new Point[4];
		this.points[0] = leftTop;
		this.points[1] = new Point(leftTop.getX() + 200, leftTop.getY());
		this.points[2] = rightBottom;
		this.points[3] = new Point(leftTop.getX(), leftTop.getY() + 100); 
		this.width = 200;
		this.height = 100;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("네 꼭지점이" + "(" + points[0] + ")" + ", " + "(" + points[1] + ")" + ", " + "(" +points[2] + ")" + ", " + "(" + points[3] + ")" + "이고,"
						+ "너비가" + width + ", " + "높이가" + height + "인 사각형을 그린다.");
		return;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [points=" + Arrays.toString(points) + ", width=" + width + ", height=" + height + "]";
	}
	
	

}
