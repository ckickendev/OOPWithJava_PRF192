package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.BaiThu2;

public class Customer {
    private String name;
    private boolean a=false;
    private String  memberType;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
