package Semeter2_OOP_With_Jav_a.WS3.Part1.StudentManagement;

import java.util.Date;


public class StudentDemo {
    public static void main(String[] args) {
        Date dob = new Date(2001, 05, 20);
        Student st= new Student("Duc Do", "DE150067", dob, "Thua Thien Hue","Software Engineer"
        ,4.0);
        st.printAllAttributes();
    }
}
