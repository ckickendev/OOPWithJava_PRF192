package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.Date;

public class InternationalTour extends Tour{

    private double superChar;

    public InternationalTour(double superChar, String code, String title, double price, String transport, Date startDay, Date endDate) {
        super(code, title, price, transport, startDay, endDate);
        this.superChar = superChar;
    }

    public InternationalTour(int numberOfDate) {
        super(numberOfDate);
    }

    public double getSuperChar() {
        return superChar;
    }

    public void setSuperChar(double superChar) {
        this.superChar = superChar;
    }

    public double getTotalChar(){
        return getSuperChar()+super.getPrice();
    }

    @Override
    public String toString() {
        return "InternationalTour{" +
                "TotalChar:" + getTotalChar() + super.toString() +
                '}';
    }
}
