package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai3;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> students;

    public StudentList(ArrayList<Student> students) {
        students = new ArrayList<>();
    }

    Validation validation = new Validation();

    public void CreatStudent(){
        while (true){
            System.out.println("Enter ID"); String id = validation.checkInputString();
            System.out.println("Enter Student Name"); String name = validation.checkInputString();
            if (validation.checkIDExist(students, id) != -1){
                System.err.println("Id has exist student. Pleas re-input.");
//                if (!Validation.checkInput())
            }
        }
    }
}
