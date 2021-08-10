package topics.oop_programming.polymorphism;

public abstract class Shape {
    // data
    private double area;

    // constructors

    // getters and setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // abstract methods
    public abstract void calculateArea();

    public void printArea() {
        System.out.println(String.format("%.1f", this.area));
    }

    //// ...
    //public abstract double findArea();
    //public abstract double findPerimeter();
    //public abstract void draw();

    @Override
    public String toString() {
        //return "Shape{" +
        //        "area=" + area +
        //        '}';
        return "Shape: area:" + String.format("%.1f", this.area);
    }
}
