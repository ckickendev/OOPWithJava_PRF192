package Semeter2_OOP_With_Jav_a.Assignment;

import java.util.Date;

public class Patient implements IPatient{
    private String code;
    private String fullName;
    private Date hospitalizedDate;
    private String gender;
    private double medicineCost;

    public Patient(String code, String fullName, Date hospitalizedDate, String gender, double medicineCost) {
        this.code = code;
        this.fullName = fullName;
        this.hospitalizedDate = hospitalizedDate;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", hospitalizedDate=" + hospitalizedDate +
                ", gender='" + gender + '\'' +
                ", medicineCost=" + medicineCost +
                '}';
    }

    @Override
    public double ComputerFee() {
        return 0;
    }
}
