package topics.oop_demo.polymorphism_demo;

public class Shape {
    protected double area;

    public void calculateArea() {
        this.area = 0.0;
    }

    public void printArea() {
        System.out.println(this.area);
    }

    @Override
    public String toString() {
        //return "Shape{" +
        //        "area=" + area +
        //        '}';
        return "Shape: area:" + this.area;
    }
}
