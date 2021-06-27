package Semeter2_OOP_With_Jav_a.Assignment;

import java.util.Date;

public class OutPatient extends Patient{
    private double examinationFee;
    private double testingFee;

    public OutPatient(String code, String fullName, Date hospitalizedDate, String gender, double medicineCost, double examinationFee, double testingFee) {
        super(code, fullName, hospitalizedDate, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    public double getTestingFee() {
        return testingFee;
    }

    public void setTestingFee(double testingFee) {
        this.testingFee = testingFee;
    }

    @Override
    public double ComputerFee(){
        return getExaminationFee()+getTestingFee()+getMedicineCost();
    }

    @Override
    public String toString() {
        return "OutPatient{" + super.toString() +
                "examinationFee=" + examinationFee +
                ", testingFee=" + testingFee +
                '}';
    }
}
