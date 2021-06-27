package Semeter2_OOP_With_Jav_a.WS3.Part1.StudentManagement;

import java.util.Date;

public class Student {
    private String name;
    private String studentID;
    private Date birthDay;
    private String address;
    private String major;
    private double gpa;

    public Student(String name, String studentID, Date birthDay, String address, String major, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.birthDay = birthDay;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printAllAttributes(){
        System.out.println("Student name: " + name);
        System.out.println("Student ID: "+ studentID);
        System.out.println("Student birthday: " + birthDay);
        System.out.println("Student address: "+ address);
        System.out.println("Student major: " +major);
        System.out.println("Student GPA: " +gpa);
    }
}
