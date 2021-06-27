package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai1;

import java.util.Scanner;

public class CdManagement {
    public static Scanner scanner = new Scanner(System.in);
    CD[] cds = new CD[20];
    int index;
    public CdManagement() {
    }

    public CD createcd(){
        System.out.println("Input ID CD: ");int id = Integer.parseInt(scanner.nextLine().trim());
        for (int i=0; i<index; i++){
            if(index>0){
                if(cds[i].getCdId() == id) {
                    System.out.println("ID not be equal");
                    System.out.println("Not succes");
                    return null;
                }
            }
        }
        System.out.println("Input title CD : ");String title = scanner.nextLine();
        System.out.println("Input single CD : ");String single = scanner.nextLine();
        System.out.println("Input number of songs: ");int number = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Input price : ");double price = Double.parseDouble(scanner.nextLine().trim());
        CD cd = new CD(id, title,single,number,price);

        cds[index]=cd;
        index++;
        return cd;
    }

    public void numberofCD(){
        if(index>0){
            System.out.println("Number of CD:" + index);
        }

    }

    public void numberofPrice(){
        if(index>0){
            int sum=0;
            for(int i=0; i< index; i++){
                sum += cds[i].getCdPrice();
            }
            System.out.println("Number of price: " + sum);
        }

    }

    public void sortPrice(){
        if(index>0){
            CD cd = new CD();
            for(int i=0; i<index; i++){
                for(int j=i+1; j<index; j++){
                    if(cds[i].getCdPrice()<cds[j].getCdPrice()){
                        cd = cds[i];
                        cds[i] = cds[j];
                        cds[j] = cd;
                    }
                }
            }
        }
        display();

    }

    public void sorttitle(){
        if(index>0){
            CD cd = new CD();
            for(int i=0; i<=index; i++){
                for(int j=i+1; j<index; j++){
                    if(cds[i].getCdTitle().compareTo(cds[j].getCdTitle())<0){
                        cd = cds[i];
                        cds[i] = cds[j];
                        cds[j] = cd;
                    }
                }
            }
        }

        display();

    }

    public void display(){
        if(index>0){
            for (int i=0; i<=index; i++){
                System.out.println(cds[i]);
            }
        }

    }
}
