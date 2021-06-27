package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.TestDegree;

import java.util.Date;

public class InternationalTour extends Tour {
    private double aviationTax;
    private double entryFee;

    public InternationalTour(String code, String title, double price, String transport, Date startDay, Date endDay) {
        super(code, title, price, transport, startDay, endDay);
    }

    public InternationalTour(String code, String title, double price, String transport, Date startDay, Date endDay, double aviationTax, double entryFee) {
        super(code, title, price, transport, startDay, endDay);
        this.aviationTax = aviationTax;
        this.entryFee = entryFee;
    }

    public double getAviationTax() {
        return aviationTax;
    }

    public void setAviationTax(double aviationTax) {
        this.aviationTax = aviationTax;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    @Override
    public String toString() {
        return "InternationalTour{" +
                "aviationTax=" + aviationTax +
                ", entryFee=" + entryFee +
                '}';
    }

    @Override
    public double TourCharge(){
        return getAviationTax() + getEntryFee();
    }
}
