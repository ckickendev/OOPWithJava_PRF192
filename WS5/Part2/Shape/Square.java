package Semeter2_OOP_With_Jav_a.WS5.Part2.Shape;

public class Square extends Rectangle{

    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }
}
