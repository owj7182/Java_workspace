package sh.java.inner.clazz;

public class Main {

	public static void main(String[] args) {
		// static 내부클래스
		OuterClass.Inner1 app = new OuterClass.Inner1();
		app.a();
		
		// non-static 내부클래스
		OuterClass outer = new OuterClass();
		OuterClass.Inner2 app2 = outer.new Inner2();
//		OuterClass.Inner2 app2 = new OuterClass().new Inner2();
		app2.a();
		
		// 지역내부클래스
		outer.test();
	}

}
