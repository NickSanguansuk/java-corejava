package topics.oop_programming.polymorphism;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

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

    @Override
    public void calculateArea() {
        super.setArea(this.width * this.height);
    }

    @Override
    public String toString() {
        //return "Rectangle{" +
        //        "width=" + width +
        //        ", height=" + height +
        //        ", area=" + area +
        //        '}';
        return "Rectangle: area:" + String.format("%.1f", super.getArea()) + ", width:" + this.width + ", height:" + this.height;
    }
}
