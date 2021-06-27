package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai1;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
