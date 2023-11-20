package sh.java.operator;

public class UnaryOperatorStudy {
	
	public static void main(String[] args) {
		UnaryOperatorStudy study = new UnaryOperatorStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 논리부정연산자
	 * !boolean
	 */
	public void test4() {
		boolean bool = true;
		
		int a = 10;
		bool = a > 10; // false
		System.out.println(!bool);
		System.out.println(!!!!bool);
	}

	public void test3(){
        int x = 10, y = 10;
        int z = ++x ; 
        System.out.println("z = " + z); // 11
        System.out.println("x = " + x); // 11
        
        z = y++; 
        System.out.println("z = " + z); // 10
        System.out.println("y = " + y); // 11
    
        x = 20;
        z = x++ + --y;
        System.out.println("x = " + x); // 21
        System.out.println("y = " + y); // 10
        System.out.println("z = " + z); // 30 
        
        int m = 20;
        int n = m++ + m;
        System.out.println("m = " + m); // 21
        System.out.println("n = " + n); // 41
        
        m = 20;
        n = m++ + --m;
        System.out.println("m = " + m); // 20
        System.out.println("n = " + n); // 40
    } 
	
	/** 
	 * 증감연산자
	 * ++
	 * --
	 * 
	 * 위치에 따라
	 * - 전위증감연산자 ++a, --a : 먼저 증감연산후에 인접연산 처리
	 * - 후위증감연산자 a++, a-- : 인접연산에 먼저 사용된후 증감처리
	 */
	public void test2() {
//		int a = 10;
//		a++; // a = a + 1
//		a++; 
//		System.out.println(a);
//		a--; // a = a - 1
//		System.out.println(a);
		
		
		int k = 10;
//		System.out.println(++k + 1); // 12
//		System.out.println(k++ + 1); // 11
//		System.out.println(k); // 11
		
//		int m = ++k;
		int m = k++;
		System.out.println(m + ", " + k);
		
		
	}
	
	
	/**
	 * 부호연산자
	 * + -
	 */
	public void test1() {
		int a = +10;
		int b = -5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(-b);
	}
}
