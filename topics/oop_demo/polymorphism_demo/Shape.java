package topics.oop_demo.polymorphism_demo;

public abstract class Shape {
    //protected double area;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //public void calculateArea() {
    //    //this.area = 0.0;
    //}
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
