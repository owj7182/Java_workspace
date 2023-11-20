package sh.java.inheritance.car;

public class CarMain {

	public static void main(String[] args) {
		Car sonata = new Car("현대", "소나타", "BLACK");
		// toString
		System.out.println(sonata.toString());
		
		
		// equals/hashCode
		// equals비교 결과가 true인 경우, hashCode값이 동일해야 한다.
		Car sonata2 = new Car("현대", "소나타", "WHITE");
		System.out.println(sonata2);
		
		System.out.println(sonata == sonata2); // false 메모리상의 주소값이 다르다.
		
		System.out.println(sonata.equals(sonata2)); // Object#equals는 ==(동등비교연산자)를 통한 주소값 비교
		
		System.out.println(sonata.hashCode());
		System.out.println(sonata2.hashCode());
		
		// clone
		Car grandeur = new Car("현대", "그랜져", "BLACK");
//		Car grandeur2 = (Car) grandeur.clone();
		Car grandeur2 = grandeur.clone();
		System.out.println(grandeur);
		System.out.println(grandeur2);
		System.out.println(grandeur == grandeur2); // false
		System.out.println(grandeur.equals(grandeur2)); // true
	}

}
