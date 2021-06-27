package Semeter2_OOP_With_Jav_a.Assignment;

import java.util.Date;

public class InPatient extends Patient{
    private double dailyFee;
    private Date dischargedDate;

    public InPatient(String code, String fullName, Date hospitalizedDate, String gender, double medicineCost, double dailyFee, Date dischargedDate) {
        super(code, fullName, hospitalizedDate, gender, medicineCost);
        this.dailyFee = dailyFee;
        this.dischargedDate = dischargedDate;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public Date getDischargedDate() {
        return dischargedDate;
    }

    public void setDischargedDate(Date dischargedDate) {
        this.dischargedDate = dischargedDate;
    }

    public int numberOfDate(){
        long noDate = (getDischargedDate().getTime()-getHospitalizedDate().getTime())/86400000;
        return Math.toIntExact(noDate);
    }

    @Override
    public double ComputerFee(){
        return numberOfDate()*getDailyFee() + numberOfDate()*getMedicineCost();
    }

    @Override
    public String toString() {
        return "InPatient{" + super.toString() +
                "dailyFee=" + dailyFee +
                ", dischargedDate=" + dischargedDate +
                '}';
    }
}
