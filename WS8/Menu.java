package Semeter2_OOP_With_Jav_a.WS8;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public int mainmenu(){
        System.out.println("Menu: ");
        System.out.println("1.Cong 2 so.");
        System.out.println("2.Tru 2 so.");
        System.out.println("3.Nhan 2 so.");
        System.out.println("4.Chia 2 so.");
        System.out.println("5.Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

}
