package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai2;

public abstract class PhoneNumber {
    protected int area;
    protected String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "area=" + area +
                ", number='" + number + '\'' +
                '}';
    }
}
