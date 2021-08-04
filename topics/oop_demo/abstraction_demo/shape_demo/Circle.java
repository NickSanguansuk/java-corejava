package topics.oop_demo.abstraction_demo.shape_demo;

public class Circle extends Shape {
    // data
    final double PI = Math.PI;
    private double radius;

    // constructors
    public Circle(double radius)
    {
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    @Override
    protected double findArea() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    protected double findPerimeter() {
        return 0;
    }

    @Override
    protected double findVolume() {
        return 0;
    }
}
