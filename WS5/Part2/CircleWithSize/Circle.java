package Semeter2_OOP_With_Jav_a.WS5.Part2.CircleWithSize;

public class Circle implements GeometricObject{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
