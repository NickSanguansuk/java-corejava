package topics.oop_demo.abstraction_demo.shape_demo;

public class Rectangle extends Shape {
    // data
    private double width;
    private double height;

    // constructors
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
        double area =  this.width * this.height;
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
