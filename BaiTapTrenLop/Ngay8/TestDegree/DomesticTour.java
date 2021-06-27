package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.TestDegree;

import java.util.Date;

public class DomesticTour extends Tour {
    private double TourGuideTip;

    public DomesticTour(String code, String title, double price, String transport, Date startDay, Date endDay, double tourGuideTip) {
        super(code, title, price, transport, startDay, endDay);
        TourGuideTip = tourGuideTip;
    }

    public double getTourGuideTip() {
        return TourGuideTip;
    }

    public void setTourGuideTip(double tourGuideTip) {
        TourGuideTip = tourGuideTip;
    }

    @Override
    public String toString() {
        return "DomesticTour{" +
                "TourGuideTip=" + TourGuideTip +
                '}';
    }

    @Override
    public double TourCharge(){
        return getTourGuideTip()*numberOfDate() + getPrice();
    }
}
