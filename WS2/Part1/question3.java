package Semeter2_OOP_With_Jav_a.WS2.Part1;

import java.util.Random;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Min: "); int min=scanner.nextInt();
        System.out.println("Max: "); int max=scanner.nextInt();
        Random random = new Random();
        int result =Math.abs(random.nextInt() % (max-min+1));
        System.out.println(result);
    }
}
