package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.Scanner;

public class Menu {
    public int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.List");
        System.out.println("3.Search tour by start date");
        System.out.println("4.Search tour by minimum tour charge");
        System.out.println("5.Remove the tour having given code");
        System.out.println("6.Sort all tours of list by multiple levels in descending order of tour’s price and\n" +
                "then in ascending order of tour’s title");
        System.out.println("7.Update tour information");
        System.out.println("8.Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
