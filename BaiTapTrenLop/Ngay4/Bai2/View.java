package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai2;

public class View {
    public static void main(String[] args) {
        Student student = new Student(9, "DE150067", "DucDo");
        Staff staff = new Staff("DE150068", "Trung Dung", "Manager");
        staff.hobbies("Talk");
        student.hobbies("Play video game");
    }
}
