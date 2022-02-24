package trainings.bfs.week1.day3.oop;

public class PolymorphismDemo {

	public static void main(String[] args) {
		//built-in overload
		Integer i1 = Integer.valueOf(-10);
		Integer i2 = Integer.valueOf("-12");
//		System.out.println(i1+" "+i2);
		
		/* 
		 * hint
		 * double d = 1; // conversion without casting needed. since double > int
		 * int i = (int)1.0; //need casting since we are trying to put bigger box into smaller box
		 */


		//overload
//		test(1.0, 4.0); //A
//		test(1, 4); //B
//		test(1.0, 4);
//		test(1, 4.0);
	

		//override
		EmployeeP test = new ManagerP();
		test.work();
	}
	public static void test(double d1, double d2) {
		System.out.println("A");
	}
	public static void test(int i, int j) {
		System.out.println("B");
	}
}


class EmployeeP{
	public void work() {
		System.out.println("work... ");
	}
}

class ManagerP extends EmployeeP{
	public void manage(){
		System.out.println("private");
	}
	@Override
	public void work() {
		super.work();
		System.out.println("manage...");
	}
}