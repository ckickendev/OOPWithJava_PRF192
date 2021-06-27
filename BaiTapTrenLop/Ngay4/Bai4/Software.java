package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

public class Software extends Product{
    String version;

    public Software() {
    }

    public Software(String version) {
        this.version = version;
    }

    public Software(String code, String description, double price, String version) {
        super(code, description, price);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Software{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", version='" + version + '\'' +
                '}';
    }
}
