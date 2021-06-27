package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.Diem10;

import java.util.Scanner;

public class StudentList {
    Student[] students;
    static int numberStudent=1;

    Scanner scanner = new Scanner(System.in);

    public StudentList() {
        this.students = new Student[10];
    }

    public StudentList(Student[] students) {
        this.students = new Student[10];
    }


    public void creat() {

        System.out.println("Nhap Id cua sinh vien: ");int id = scanner.nextInt();scanner.nextLine();
        System.out.println("Nhap ten sinh vien: ");String name = scanner.nextLine();
        System.out.println("Nhap semeter: ");int ster = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap course name: "); String coursename = Validdation.checkinputCourse();
        System.out.println("");


        Student student = new Student(id, name, ster, coursename);
        this.students[numberStudent]= student;

        ++numberStudent;
    }

    public void display() {
        for (int i=1;i<=numberStudent; i++ ){
            System.out.println(students[i]);
        }
    }
}
