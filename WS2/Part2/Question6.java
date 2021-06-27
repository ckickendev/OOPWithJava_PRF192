package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: " );int day= scanner.nextInt();
        System.out.print("Enter the month: "); int month = scanner.nextInt();
        String[] arr = {"Wednesday" ,"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
        int[] ngaythang = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int currenday = 0;
        for(int i=0; i<month; i++){
            currenday += ngaythang[i];
        }
        System.out.println(currenday);
        currenday = currenday + day;
        int thu = currenday%7;
        System.out.println(thu);
        System.out.println(arr[thu]);
    }
}
