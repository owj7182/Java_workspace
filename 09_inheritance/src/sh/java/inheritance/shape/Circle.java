package sh.java.inheritance.shape;

/**
 * <pre>
 * Circle - Point
 *  - has-a 포함관계(연관관계 Association) 
 *  - Circle has a Point
 *  
 * Circle - Shape
 *  - is-a 상속관계(일반화관계 Generalization)
 *  - Circle is a Shape.
 *  
 *  
 * 2023-09-26
 *
 */
public class Circle extends Shape {
	private Point center; 	// 중심점
	private int r; 			// 반지름
	
	public Circle() {
//		this.center = new Point(0, 0);
//		this.r = 10;
		this(new Point(0, 0), 10);
	}
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	/**
	 * 중심점인 (x, y)이고, 반지름이 r인 원을 그린다.
	 */
	@Override
	public void draw() {
		System.out.printf("중심점인 (%s)이고, 반지름이 %d인 원을 그린다.\n", 
				center.toString(), r);
	}
	
	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
}
