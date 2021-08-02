package topics.oop_demo.polymorphism_demo;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        super.area = this.width * this.height;
    }
}
