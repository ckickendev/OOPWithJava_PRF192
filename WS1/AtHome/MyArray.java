package Semeter2_OOP_With_Jav_a.WS1.AtHome;

import java.util.Scanner;

public class MyArray {
    int[] myArr;
    int size;
    Scanner scanner = new Scanner(System.in);

    public MyArray(int size) {
        this.myArr = new int[size];
    }

    public void EnterArray(int size ){
        for(int i=0; i<size; i++){
            System.out.print("phan tu thu "+i+" : " );
            myArr[i] = scanner.nextInt();
        }
    }

    public void OutputArray(int size){
        for(int i=0; i<size; i++){
            System.out.println("phan tu "+i+" : "+ myArr[i]);
        }
    }

    public int SumArray(int size){
        int sum = 0;
        for (int i = 0; i < size ; i++) {
            sum+= myArr[i];
        }
        return sum;
    }

    public void SortArray(int size){
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                if(myArr[i]<myArr[j]){
                    int c = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = c;
                }
            }
        }
        System.out.println("LinearS after sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+myArr[i]);
        }
    }
}
