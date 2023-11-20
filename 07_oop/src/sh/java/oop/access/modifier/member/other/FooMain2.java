package sh.java.oop.access.modifier.member.other;

import sh.java.oop.access.modifier.member.Foo;

public class FooMain2 {

	public static void main(String[] args) {
		Foo foo = new Foo();
//		System.out.println(foo.a); // The field Foo.a is not visible
//		System.out.println(foo.b); // The field Foo.b is not visible
//		System.out.println(foo.c); // The field Foo.c is not visible
		System.out.println(foo.d);
		
//		foo.e(); // The method e() from the type Foo is not visible
//		foo.f(); // The method f() from the type Foo is not visible
//		foo.g(); // The method g() from the type Foo is not visible
		foo.h();

	}

}
