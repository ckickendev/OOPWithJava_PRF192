package Semeter2_OOP_With_Jav_a.WS5.Part1.WorkerManagement;

import java.util.Scanner;

public class Validation {
    public static final Scanner scanner = new Scanner(System.in);

    public static String checkString(){
        while(true){
            String result = scanner.nextLine();
            if (result.isEmpty()){
                System.out.println("Invalid");
                System.out.println("Please check again");
            }
            else {
                return result;
            }
        }
    }

    public static double checkDouble(){
        while (true){
            double result = Double.parseDouble(scanner.nextLine());
            return result;
        }
    }
}
