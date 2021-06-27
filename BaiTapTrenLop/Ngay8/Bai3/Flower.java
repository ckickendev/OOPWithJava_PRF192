package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

import java.io.Serializable;

public class Flower implements Serializable {
    private String id;
    private String name;
    private String local;
    private String color;
    private double price;

    public Flower(String id, String name, String local, String color, double price) {
        this.id = id;
        this.name = name;
        this.local = local;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
