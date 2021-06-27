package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai1;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea(){
        return 0;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
