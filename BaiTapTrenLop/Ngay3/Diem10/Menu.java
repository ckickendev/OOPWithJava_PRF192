package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.Diem10;

import java.util.Scanner;

public class Menu {
    StudentList studentList = new StudentList();
    Scanner scanner = new Scanner(System.in);
    public int select(){
        System.out.println("Menu: ");
        System.out.println("1. Creat.");
        System.out.println("2. Display.");
        System.out.println("3. Exit.");
        int choice;
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();scanner.nextLine();
        return choice;
    }

}
