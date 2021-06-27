package Semeter2_OOP_With_Jav_a.WS1.AtHome;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");int size = scanner.nextInt();

        MyArray myArray = new MyArray(size);
        int select;
        do {


            System.out.println("----------------------Menu--------------------");
            System.out.println("1.Enter array");
            System.out.println("2.Out LinearS");
            System.out.println("3.Sum of LinearS");
            System.out.println("4.Sort array");
            System.out.println("5.Exit");
            select = scanner.nextInt();
            switch (select) {
                case 1: {
                    myArray.EnterArray(size);
                    break;
                }
                case 2: {
                    System.out.println("The LinearS is:");
                    myArray.OutputArray(size);
                    break;
                }
                case 3: {
                    System.out.println("Sum of all of element: " + myArray.SumArray(size));
                    break;
                }
                case 4: {
                    myArray.SortArray(size);
                    break;
                }
                default: {
                    break;
                }
            }

        }while(select!=5);

    }
}
