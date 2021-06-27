package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public int menuu(){
        int choice;
        System.out.println("Menu: ");
        System.out.println("1. Add product: ");
        System.out.println("2. Display all product: ");
        System.out.println("3. Exit: ");
        choice = scanner.nextInt();
        return choice;
    }
}
