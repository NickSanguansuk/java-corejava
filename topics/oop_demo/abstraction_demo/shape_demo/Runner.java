package topics.oop_demo.abstraction_demo.shape_demo;

public class Runner {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 30);
        Shape triangle = new Triangle(20, 40);
        Shape square = new Square(30);

        //System.out.println("Circle area: " + circle.findArea());
        System.out.printf("Circle area: %.1f\n", circle.findArea());

        //System.out.println("Rectangle area: " + rectangle.findArea());
        System.out.printf("Rectangle area: %.1f\n", rectangle.findArea());

        System.out.printf("Triangle area: %.1f\n", triangle.findArea());

        System.out.printf("Square area: %.1f\n", square.findArea());

        System.out.println("----------");

        Shape[] shapeArray = new Shape[4];
        shapeArray[0] = circle;
        shapeArray[1] = rectangle;
        shapeArray[2] = triangle;
        shapeArray[3] = square;

        for (Shape s : shapeArray) {
            System.out.printf("Shape area: %.1f\n", s.findArea());
        }

        System.out.println("----------");

        for (Shape s : shapeArray) {
            System.out.println(s);
        }

        System.out.println("----------");

    }
}
