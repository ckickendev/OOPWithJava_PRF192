package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input second");
        int seconds= scanner.nextInt();
        int hour, minute, second;
        hour = seconds / 3600;
        seconds = seconds - hour*3600;
        minute = seconds % 60;
        second = seconds - minute*60;
        System.out.println(hour+":"+minute+":"+second);
    }
}
