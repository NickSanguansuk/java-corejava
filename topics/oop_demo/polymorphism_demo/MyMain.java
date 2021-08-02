package topics.oop_demo.polymorphism_demo;

public class MyMain {

    public static void main(String[] args) {

        Shape circle = new Circle(1.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape triangle = new Triangle(4.0, 1.0);

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();

        System.out.println("----------");

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();

        System.out.println("----------");

    }
}
