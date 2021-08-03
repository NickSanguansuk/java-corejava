package topics.oop_demo.polymorphism_demo;

public class Square extends Rectangle {

    public Square(double widthAndHeight) {
        super(widthAndHeight, widthAndHeight);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String toString() {
        //return "Square{" +
        //        "area=" + area +
        //        '}';
        //return "Square: area:" + String.format("%.1f", super.area) + ", width:" + super.getWidth() + ", height:" + super.getHeight();
        return String.format("Square: area:%.1f, width:%.1f, height:%.1f", super.getArea(), super.getWidth(), super.getHeight());
    }
}
