package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

public class Product {
    String code;
    String description;
    double price;
    static int count;

    public Product() {
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
