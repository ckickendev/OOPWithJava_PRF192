package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay6.Bai2;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassWordDemo ducdo = new PassWordDemo("Nguyen", "Van", "DucDo", 19);

        System.out.println("Your Pass is: ");
        System.out.println(ducdo.generatePass());

        System.out.println("Enter your new pass: ");String newpass = scanner.nextLine();
        System.out.println("Your new pass is "+ ducdo.changePass(newpass));

        System.out.println(" ");
        System.out.println("==========================");
        System.out.println("Your new pass after upcase");
        ducdo.upperPass();
        System.out.println(ducdo.getFullpass());
    }
}
