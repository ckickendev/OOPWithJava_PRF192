package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        int choice;
        Menu a = new Menu();
        Scanner scanner = new Scanner(System.in);
        ToutList toutList = new ToutList();
        Validation validation = new Validation();

        do {
            choice = a.menu();
            switch (choice){
                case 1: {
                    toutList.addTour();
                    break;
                }
                case 2: {
                    toutList.printTour();
                    break;
                }
                case 3:{
                    toutList.searchByDate();
                    break;
                }
                case 4:{
                    toutList.searchTourByMinPrice();
                    break;
                }
                case 5:{
                    toutList.removeTour();
                    break;
                }
                case 6:{
                    toutList.sortTOur();
                    break;
                }
                case 7:{
                    toutList.updateTour();
                    break;
                }
            }
        }while (choice!=8);
    }
}
