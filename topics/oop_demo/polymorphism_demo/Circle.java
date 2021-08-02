package topics.oop_demo.polymorphism_demo;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.area = Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        //return "Circle{" +
        //        "radius=" + radius +
        //        ", area=" + area +
        //        '}';
        return "Circle: area:" + super.area + ", radius:" + this.radius;

    }
}
