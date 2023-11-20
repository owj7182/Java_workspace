package sh.java.inheritance.shape;

public class ShapeMain {

	public static void main(String[] args) {
//		Circle c1 = new Circle(); // 기본생성자 호출시 기본값으로 중심점, 반지름 생성
//		c1.draw();
//		System.out.println(c1.getArea());
		
//		Circle c2 = new Circle(new Point(10, 10), 30);
//		c2.draw();
//		System.out.println(c2.getArea());
		
		// rect1
		Point[] points = {
			new Point(0,0), 
			new Point(200,0), 
			new Point(200,100), 
			new Point(0,100)
		};
		Rectangle rect = new Rectangle(points);
		rect.draw();
		System.out.println("사각형의 너비는 " + rect.getArea() + "입니다.");
		System.out.println(rect);

		// rect2, rect3
		// 아래 생성자도 동일하게 처리되어야 한다.
		Rectangle rect2 = new Rectangle(new Point(0,0), 200, 100);
		Rectangle rect3 = new Rectangle(new Point(0,0), new Point(200,100));
		System.out.println(rect2);
		System.out.println(rect3);
		}

}
