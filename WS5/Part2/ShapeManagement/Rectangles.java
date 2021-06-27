package Semeter2_OOP_With_Jav_a.WS5.Part2.ShapeManagement;

public class Rectangles extends Shape {
     double width;
     double length;

    public Rectangles() {
        this.width=1.0;
        this.length=1.0;
    }

    public Rectangles(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangles(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangles{" + super.toString()+
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
