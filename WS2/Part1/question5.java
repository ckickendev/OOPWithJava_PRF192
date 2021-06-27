package Semeter2_OOP_With_Jav_a.WS2.Part1;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        int odd=0, even=0;
        for (int i = 0; i < length; i++) {
            if(arr[i]%2==0){
                odd+=1;
            }
            if(arr[i]%2!=0) {
                even+=1;
            }
        }
        System.out.println("Even :"+ even);
        System.out.println("Odd :" + odd);
    }
}
