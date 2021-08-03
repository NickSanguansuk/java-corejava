package topics.oop_demo.polymorphism_demo;

public class Shape {
    protected double area;

    public void calculateArea() {
        //this.area = 0.0;
    }

    public void printArea() {
        System.out.println(String.format("%.1f", this.area));
    }

    @Override
    public String toString() {
        //return "Shape{" +
        //        "area=" + area +
        //        '}';
        return "Shape: area:" + String.format("%.1f", this.area);
    }
}
