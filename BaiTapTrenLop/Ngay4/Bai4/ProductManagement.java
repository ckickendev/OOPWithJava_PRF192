package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

import java.util.Scanner;

public class ProductManagement {
    Product[] products = new Product[20];
    Scanner scn = new Scanner(System.in);
    int index=0;

    public void addProduct(){
        System.out.println("What type of your choice:(1.Book or 2.Software) ");
        int choice1 = Integer.parseInt(scn.nextLine());
        switch (choice1){
            case 1:{
//                String code, String description, double price, String author
                System.out.println("Enter code: " );String code = scn.nextLine();
                System.out.println("Enter desciption");String des =scn.nextLine();
                System.out.println("Enter price: ");double price = Double.parseDouble(scn.nextLine());
                System.out.println("Enter author: ");String author = scn.nextLine();
                Book book = new Book(code,des,price,author);
                products[index] = book;
                ++index;
                break;
            }
            case 2:{
//                String code, String description, double price, String version
                System.out.println("Enter code: " );String code = scn.nextLine();
                System.out.println("Enter desciption");String des =scn.nextLine();
                System.out.println("Enter price: ");double price = Double.parseDouble(scn.nextLine());
                System.out.println("Enter version: ");String version = scn.nextLine();
                Software software = new Software(code, des, price, version);
                products[index] = software;
                ++index;
                break;
            }
        }
    }

    public void displayAll(){
        for (int i=0; i<=index; i++){
            System.out.println(products[i]);
        }
    }
}
