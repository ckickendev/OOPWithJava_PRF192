package Semeter2_OOP_With_Jav_a.WS5.Part1.PhoneManagement;

import java.util.Scanner;

public class Validation {
    public final static Scanner scanner = new Scanner(System.in);
    private static final String VALID_PHONE = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";

    public static String checkInputString(){
        while(true){
            String result = scanner.nextLine();
            if(result.isEmpty()){
                System.out.println("Invalid\nCheck again.");
            }
            else return result;
        }
    }

    public static String checkInputPhone(){
        while (true){
            String result = checkInputString();
            if(result.matches(VALID_PHONE)){
                return result;
            }
            else {
                System.out.println("Invalid\nCheck phone again.");
            }
        }
    }
}
