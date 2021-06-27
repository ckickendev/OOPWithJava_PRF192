package Semeter2_OOP_With_Jav_a.WS5.Part2.ShapeManagement;

public class Square extends Rectangles {
    public Square() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side,side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return getLength();
    }

    public void setSide (double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
        setWidth(side);
    }


    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }


}
