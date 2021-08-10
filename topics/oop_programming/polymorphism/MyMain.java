package topics.oop_programming.polymorphism;

public class MyMain {

    public static void main(String[] args) {

        Shape circle = new Circle(1.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape triangle = new Triangle(4.0, 1.0);
        Shape square = new Square(3.0);

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();
        square.printArea();

        System.out.println("Put all Shapes in an array, and use for each loop");

        Shape[] shapeArray = new Shape[4];
        shapeArray[0] = circle;
        shapeArray[1] = rectangle;
        shapeArray[2] = triangle;
        shapeArray[3] = square;

        for (Shape s : shapeArray) {
            System.out.println(s);
        }

        System.out.println("----------");

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
        square.calculateArea();

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();
        square.printArea();

        System.out.println("----------");

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(square.toString());

        System.out.println("----------");
    }
}
