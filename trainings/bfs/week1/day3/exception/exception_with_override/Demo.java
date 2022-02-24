package trainings.bfs.week1.day3.exception.exception_with_override;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo {

	public static void main(String[] args) {
		Manager m = new Manager();
		try {
			m.work2();
			System.out.println("work done");
		} catch (Exception e) {
			System.out.println("caught exception");
		} finally {
			
		}
	}

}

class Employee {
	public void work() {
		System.out.println("work");
	}
	public void work2() throws IOException{
		InputStream is = new FileInputStream("");
		System.out.println("work 2");
	}
}
class Manager extends Employee{
	
    //when there is no exception thrown in work() in parent class: 
//	@Override
//	public void work() {
//		System.out.println("a work and manage");
//	}
	
//	@Override
//	public void work() throws IOException {
//		System.out.println("b work and manage");
//	}
//	
//	@Override
//	public void work() throws NullPointerException {
//		System.out.println("c work and manage");
//	}
	
	
	//when there is an checked exception thrown in work2() in parent class: 
//	@Override
//	public void work2(){
//		System.out.println("a work and manage 2");
//	}
	
//	@Override
//	public void work2() throws IOException {
//		System.out.println("b work and manage 2");
//	}
	
//	@Override
//	public void work2() throws Exception {
//		System.out.println("c work and manage 2");
//	}
	
//	@Override
//	public void work2() throws FileNotFoundException {
//		System.out.println("c work and manage 2");
//	}

}