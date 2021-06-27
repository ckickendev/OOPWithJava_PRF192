package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai2;

public class LocaPhoneNumber extends PhoneNumber{
    private String localCode;

    public LocaPhoneNumber() {
    }

    public LocaPhoneNumber(String localCode) {
        this.localCode = localCode;
    }

    public LocaPhoneNumber(int area, String number, String localCode) {
        super(area, number);
        this.localCode = localCode;
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    @Override
    public String toString() {
        return "LocaPhoneNumber{" +
                "localCode='" + localCode + '\'' +
                ", area=" + area +
                ", number='" + number + '\'' +
                '}';
    }
}
