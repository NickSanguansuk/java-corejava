package topics.oop_demo.polymorphism_demo;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        super.setArea(0.5 * this.base * this.height);
    }

    @Override
    public String toString() {
        //return "Triangle{" +
        //        "area=" + area +
        //        ", base=" + base +
        //        ", height=" + height +
        //        '}';
        return "Triangle: area:" + String.format("%.1f", super.getArea()) + ", base:" + this.base + ", height:" + this.height;
    }
}
