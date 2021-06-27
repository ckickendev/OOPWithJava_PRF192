package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array :");
        int leng = scanner.nextInt();
        int[] arr = new int[leng];
        for(int i=0; i< leng; i++){
            System.out.print("input element of "+ i+ " ");
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<leng; i++){
            for(int j=i+1; j<leng; j++ ){
                if(arr[i]>arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        System.out.println("Input k"); int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
