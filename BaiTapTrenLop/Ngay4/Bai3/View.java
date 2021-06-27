package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai3;

public class View {
    public static void main(String[] args) {
        Student student = new Student("DucDo", "Nha Trang");
        student.addCourseGrade("Math", 12);
        student.addCourseGrade("Java", 10);

        Teacher teacher = new Teacher("Trung Dung", "Vung Tau ");
        teacher.addCourse("Math");
        teacher.addCourse("Java");

        System.out.println(student);
        student.printGrade();
        System.out.println(teacher);
    }
}
