package topics.oop_demo.abstraction_demo.shape_demo;

public class Triangle extends Shape {
    // data
    private double base;
    private double height;

    // constructors
    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    // getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // methods
    @Override
    protected double findArea() {
        double area = 0.5 * this.base * this.height;
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
