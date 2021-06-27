package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

public class Book extends Product{
    String author;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String code, String description, double price, String author) {
        super(code, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
