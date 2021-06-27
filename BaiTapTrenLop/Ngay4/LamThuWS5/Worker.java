package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.LamThuWS5;

public class Worker extends Person{
    private double bSalary;
    private double rate;

    public Worker() {
    }

    public Worker(double bSalary, double rate) {
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(String name, double bSalary, double rate) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getSalary(){
        return bSalary*rate;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString()+
                "bSalary=" + bSalary +
                ", rate=" + rate +
                '}';
    }
}
