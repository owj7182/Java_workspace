package first;

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 homework = new Test1();
		homework.test1();
		homework.test2();
		homework.test3();
		homework.test4();
		homework.test5();
		
	}
	
	public void test1() {
		int a = 100;
		long b = 999_900_000_000L;
		System.out.println(a);
		System.out.println(b + " = " + "9999억 입니다.");
	}
	
	public void test2() {
		float f = 486.567f;
		double d = 567.890123;
		System.out.println(f);
		System.out.println(d);
		
	}
	
	public void test3() {
		char ch = 'A';
		System.out.println(ch);		
		
	}
	
	public void test4() {
		String str = "Hello world";
		System.out.println(str);
		
	}
	
	public void test5() {
		int a = 100;
		int b = 20;
		System.out.println(a != b);
	}
	
	
	

}
