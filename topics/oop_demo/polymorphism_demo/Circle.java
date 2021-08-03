package topics.oop_demo.polymorphism_demo;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        //return "Circle{" +
        //        "radius=" + radius +
        //        ", area=" + area +
        //        '}';
        return "Circle: area:" + String.format("%.1f", super.getArea()) + ", radius:" + this.radius;

    }
}
