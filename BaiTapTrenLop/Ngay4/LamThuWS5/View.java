package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.LamThuWS5;

public class View {
    public static void main(String[] args) {
        Worker worker = new Worker("DucDO", 1000, 0.3);
        System.out.println(worker);
        System.out.println("End Salary: " +worker.getSalary());
    }
}
