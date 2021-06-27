package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

import java.io.Serializable;

public class Book implements Serializable {
    private String id;
    private String author;
    private String title;
    private double price;

    public Book(String id, String author, String title, double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
