package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.nextLine();
        int vowel =0;
        for (int i = 0; i < string.length() ; i++) {
            if(string.charAt(i)=='a' || string.charAt(i)=='A' || string.charAt(i)=='u' || string.charAt(i)=='U'
            || string.charAt(i)=='o' || string.charAt(i)=='O' || string.charAt(i)=='e' || string.charAt(i)=='E'
            || string.charAt(i)=='i' || string.charAt(i)=='I'){
                vowel+=1;
            }
        }
        System.out.println("Vowel: "+ vowel);
    }
}
