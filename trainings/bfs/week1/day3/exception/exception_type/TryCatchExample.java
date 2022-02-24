package trainings.bfs.week1.day3.exception.exception_type;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TryCatchExample {
	
	public static void main(String[] args) throws Exception {

		tryCatch();
		
//		throwException();

//		try {
//			throwsException();
//		} catch (Exception e) {
//			System.out.println("Exception handled");
//		}
	
		
//		int rst = tryCatchFinally();
//		System.out.println(rst);
	
//		tryCatchFinally2();
		
		customizedException();
	}
	
	public static void tryCatch() {
		try {
			System.out.print("a");
			InputStream is = new FileInputStream(""); // exception
			//read file
			//....
			// exception
			System.out.println("b");
		} catch (FileNotFoundException e) {
			System.out.print("c");
		} catch(Exception e) {
			System.out.println("e");
		}
		System.out.print("d");
	}

	public static int tryCatchFinally(){		
		try {
			InputStream is = new FileInputStream("");
		} catch (Exception e) {
			System.out.println("catch file not found exception");
			return 1;
		} finally {
			System.out.println("Finally block");
//			return 2;
		}
		return 3;
	}
	
	public static void tryCatchFinally2(){		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.print("A");
			return;
//			System.exit(1);
		} finally {
			System.out.print("B");
		}
	}
	
	//demo for throw
	public static void throwException() {
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("There is a exception: " + e.toString());
		}
	}
	
	//demo for throws
	public static void throwsException() throws Exception {
		throw new Exception();
	}
	
	public static void customizedException() {
//		try {
			throw new DataNotFoundException();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
}
