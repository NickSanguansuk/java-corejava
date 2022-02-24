package trainings.bfs.week1.day3.oop;

public interface Interface1 {

	void simpleMethod();
	
	default void test() {
		System.out.println("test() in Interface1");
	}
}
