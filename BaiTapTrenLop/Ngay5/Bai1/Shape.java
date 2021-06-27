package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai1;

public abstract class Shape{
    protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
