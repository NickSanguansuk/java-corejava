package trainings.bfs.week1.day3.exception.exception_order;

public class Test {
	
	String str = "a";

	public static void main(String[] args) {
		Test object = new Test();
		object.A();
		object.display();
	}
	
	void A() {
		try {
			str += "b";
			B();
		} catch (Exception e) {
			str += "c";
		}
	}

	void B() throws Exception {
		try {
			str += "d";
			C();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "e";
		}
		str += "f";
	}
	void C() throws Exception {
//		throw new Exception();
	}
	void display() {
		System.out.println(str);
	}

}
