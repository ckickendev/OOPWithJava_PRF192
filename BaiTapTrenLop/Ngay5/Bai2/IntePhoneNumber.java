package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai2;

public class IntePhoneNumber extends PhoneNumber{
    private String countryCode;

    public IntePhoneNumber() {
    }

    public IntePhoneNumber(String countryCode) {
        this.countryCode = countryCode;
    }

    public IntePhoneNumber(int area, String number, String countryCode) {
        super(area, number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "IntePhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", area=" + area +
                ", number='" + number + '\'' +
                '}';
    }
}
