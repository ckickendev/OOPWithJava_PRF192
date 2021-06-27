package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai10D;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public int menu(){
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.Display");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Exit");
        System.out.println("Please choose your choice");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
