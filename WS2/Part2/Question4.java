package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array :");
        int leng = scanner.nextInt();
        int[] arr = new int[leng];
        int sum=0;
        for(int i=0; i< leng; i++){
            System.out.println("input element of "+ i);
            arr[i] = scanner.nextInt();
            sum+= arr[i];
        }
        System.out.println("Sum of array: " +sum);
    }
}
