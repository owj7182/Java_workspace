package sh.java.oop.access.modifier.member;

public class FooMain {

	public static void main(String[] args) {
		Foo foo = new Foo();
		// System.out.println(foo.a); // The field Foo.a is not visible
		System.out.println(foo.b);
		System.out.println(foo.c);
		System.out.println(foo.d);
		
//		foo.e(); // The method e() from the type Foo is not visible
		foo.f();
		foo.g();
		foo.h();

	}

}
