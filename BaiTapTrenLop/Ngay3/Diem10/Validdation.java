package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.Diem10;

import java.util.Scanner;

public class Validdation {
    private static final Scanner in = new Scanner(System.in);
    public static String checkinputCourse(){
        while(true){
            String result = in.nextLine();
            if(result=="Java" || result==".Net" || result=="C/C++"){
                return result;
            }
            else {
                System.out.println("Invalid");
                System.out.println("Please check again: ");
            }
        }
    }
}