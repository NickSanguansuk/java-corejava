package trainings.bfs.week1.day3.oop;

public class AbstractionDemo {

	public static void main(String[] args) {
		Shape s = new Circle();
	}

}
abstract class Shape {
	public Shape() {
		System.out.println("constructor of Shape");
	}
	abstract void draw();
	int getArea() {
		return 0;
	}
}
class Circle extends Shape{
	public Circle() {
		System.out.println("constructor of Circle");
	}

	@Override
	void draw() {
		System.out.println("draw o");
	}
}