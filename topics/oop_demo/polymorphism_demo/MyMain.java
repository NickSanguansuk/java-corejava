package topics.oop_demo.polymorphism_demo;

public class MyMain {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Circle(1.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape triangle = new Triangle(4.0, 1.0);

        shape.printArea();
        circle.printArea();
        rectangle.printArea();
        triangle.printArea();

        System.out.println("----------");

        shape.calculateArea();
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        shape.printArea();
        circle.printArea();
        rectangle.printArea();
        triangle.printArea();

        System.out.println("----------");

        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());

    }
}
