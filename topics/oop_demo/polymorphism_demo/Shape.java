package topics.oop_demo.polymorphism_demo;

public abstract class Shape {
    protected double area;

    public abstract void calculateArea();

    public void printArea() {
        System.out.println(this.area);
    }
}
