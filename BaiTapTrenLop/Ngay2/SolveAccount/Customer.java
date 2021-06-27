package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.SolveAccount;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer() {
    }

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
