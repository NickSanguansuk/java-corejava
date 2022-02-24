package trainings.bfs.week1.day3.exception.exception_order;

import java.io.IOException;

public class OrderExample {

	public static void main(String[] args) {
		method1();
//		method2();
//		method3();
	}
	

	// Hierarchy: Exception -> A -> B -> C
	public static void method1() {
		try {
			throw new C("Exception C occurs");
		} catch (C c) {
			System.out.println(c.toString());
		} catch (B b) {
			System.out.println(b.toString());
		} catch (A a) {
			System.out.println(a.toString());
		}
	}

//	public static void method2() {
//		try {
//			throw new C("exception c occurs");
//		} catch (A a) {
//
//		} catch (B b) {
//
//		} catch (C a) {
//
//		}
//	}

	public static void method3() {
		try {
			throw new C("Exception C occurs");
		} catch (A a) {
			System.out.println(a.toString());
		}

	}
}

// Hierarchy: Exception -> A -> B -> C

class A extends Exception {
	public A(String message) {
		super(message);
	}
}

class B extends A {
	public B(String message) {
		super(message);
	}
}

class C extends B {
	public C(String message) {
		super(message);
	}
}