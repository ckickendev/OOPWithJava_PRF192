package Semeter2_OOP_With_Jav_a.WS2.Part1;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = scanner.nextLine();
        if(isPassword(s)){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static boolean isPassword(String s){
        if(s.length()<10){
            return false;
        }
        int digit=0;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)<='A' && s.charAt(i)>='Z') || (s.charAt(i)<='a' && s.charAt(i)>='z')
                    || s.charAt(i)<='0' && s.charAt(i)>='9' )
                return false;
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                digit += 1;
            }
        }
        if(digit<2){
            return false;
        }
    return true;
    }
}
