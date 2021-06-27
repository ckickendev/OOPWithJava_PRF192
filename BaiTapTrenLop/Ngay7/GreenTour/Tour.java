package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.Date;

public class Tour implements ITour{
    private String code;
    private String title;
    private double price;
    private String transport;
    private Date startDay;
    private Date endDate;

    public Tour(String code, String title, double price, String transport, Date startDay, Date endDate) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDay = startDay;
        this.endDate = endDate;
    }

    public Tour(int numberOfDate) {
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date enddate) {
        this.endDate = enddate;
    }

    public int numberOfDate(){
        long noDate = (endDate.getTime()-startDay.getTime())/86400000;
        return Math.toIntExact(noDate);
    }


    @Override
    public double tourCharge() {
        return 0;
    }

    @Override
    public Tour inputdata() {
        return null;
    }

    @Override
    public void printData() {

    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", transport='" + transport + '\'' +
                ", startDay=" + startDay +
                ", endDate=" + endDate +
                '}';
    }
}

