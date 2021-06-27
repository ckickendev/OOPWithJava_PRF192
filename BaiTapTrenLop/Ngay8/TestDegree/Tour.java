package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.TestDegree;

import java.util.Date;

public class Tour implements ITour{
    private String code;
    private String title;
    private double price;
    private String transport;
    private Date startDay;
    private Date endDay;

    public Tour(String code, String title, double price, String transport, Date startDay, Date endDay) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public int numberOfDate(){
        long noDate = (endDay.getTime()-startDay.getTime())/86400000;
        return Math.toIntExact(noDate);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", transport='" + transport + '\'' +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                '}';
    }

    @Override
    public double TourCharge() {
        return 0;
    }
}
