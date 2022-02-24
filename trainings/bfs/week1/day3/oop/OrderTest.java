package trainings.bfs.week1.day3.oop;

public class OrderTest {

	public static void main(String[] args) {
		Child c = new Child("hi");
	}

}
class Child extends Parent{
	public Child() {
		System.out.println("child");
	}
	public Child(String msg) {
		super(msg);
		System.out.println("child "+msg);
	}
}
class Parent extends GrandParent{
	public Parent() {
		System.out.println("parent");
	}
	public Parent(String msg) {
		System.out.println("parent "+msg);
	}
}
class GrandParent{
	public GrandParent() {
		System.out.println("Grand Parent");
	}
}