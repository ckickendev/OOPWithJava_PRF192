package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.Date;

public class DomesticTour extends Tour{
    private double guideTip;

    public DomesticTour(String code, String title, double price, String transport, Date startDay, Date endDate, double guideTip) {
        super(code, title, price, transport, startDay, endDate);
        this.guideTip = guideTip;
    }

    public DomesticTour(int numberOfDate, double guideTip) {
        super(numberOfDate);
        this.guideTip = guideTip;
    }

    public double tourCharge(){
       return this.guideTip * super.numberOfDate();
    }

    @Override
    public String toString() {
        return "DomesticTour{" +
                "price" + tourCharge() + super.toString() +
                '}';
    }

    public int compareTo(DomesticTour o){
        return 0;
    }
}
