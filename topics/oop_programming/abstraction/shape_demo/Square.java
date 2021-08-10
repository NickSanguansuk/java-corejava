package topics.oop_programming.abstraction.shape_demo;

public class Square extends Rectangle {
    // data

    // constructors
    public Square(double widthAndHeight) {
        super(widthAndHeight, widthAndHeight);
    }

    // getters and setters
    // need to override setters
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

    // methods
    // can use all the parent methods

}
