package Semeter2_OOP_With_Jav_a.WS5.Part2.PersonManagement;

public class View {
    public static void main(String[] args) {
        Student student = new Student("Duc Do", "Thua Thien Hue", "Java", 2020,20.3);
        Staff staff = new Staff("Trung Dung", "Quang Binh", "FPTU", 20.5);

        System.out.println("Info student");
        System.out.println(student);

        System.out.println("Info staff");
        System.out.println(staff);
    }
}
