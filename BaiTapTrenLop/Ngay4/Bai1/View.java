package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai1;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu.displayMenu();
        int choice;
        CD[] cds = new CD[20];
        CdManagement cdManagement = new CdManagement();
        do{
            System.out.println("Please choose your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    cdManagement.createcd();
                    break;
                }
                case 2:{
                    cdManagement.numberofCD();
                    break;
                }
                case 3:{
                    cdManagement.numberofPrice();
                    break;
                }
                case 4:{
                    cdManagement.sortPrice();
                    break;
                }
                case 5:{
                    cdManagement.sorttitle();
                    break;
                }
                case 6:{
                    cdManagement.display();
                    break;
                }
            }
        }while(choice>0 && choice<7);
    }
}
