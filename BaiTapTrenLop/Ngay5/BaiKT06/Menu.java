package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.BaiKT06;

import java.util.Scanner;

public class Menu {
    public int MenuChoice() {
        int choice;
        System.out.println("Menu: ");
        System.out.println("1.Enter list");
        System.out.println("2.Display list");
        System.out.println("3.Update list");
        System.out.println("4.Delete list");
        System.out.println("5.Exit");
        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
