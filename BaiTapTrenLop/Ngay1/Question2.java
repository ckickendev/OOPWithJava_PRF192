package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
            double radius,perimeter,area;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter radius");
            radius=scanner.nextDouble();
            perimeter = 2 * Math.PI * radius;
            area= Math.PI * radius*radius;
            System.out.println("Perimeter is = " + perimeter);
            System.out.printf("Area is = %.3f\n",area);
    }
}
