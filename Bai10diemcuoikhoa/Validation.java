package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    public final Scanner scanner = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max){
        while(true){
            int result = Integer.parseInt(scanner.nextLine().trim());
            if(result<min || result>max){
                System.out.println("Your input wrong");
            } else {
               return result;
            }
        }
    }

    public String checkInputString(){
        while (true){
            String result = scanner.nextLine();
            if(!result.isEmpty()){
                return result;
            }else {
                System.out.println("Your input must be not null");
                System.out.println("Please input again");
            }
        }
    }

    public int checkInputInt(){
        while (true){
            String result = checkInputString();
            if(Integer.parseInt(result)>0){
                return Integer.parseInt(result);
            }else {
                System.out.println("Invalid\n Please check again");
            }
        }
    }

    public double checkInputDouble(){
        while (true){
            String result = checkInputString();
            if(Double.parseDouble(result)>0.00){
                return Double.parseDouble((result));
            }else {
                System.out.println("Invalid value\n Please check again");
            }
        }
    }

    public boolean checkInputYN(){
        while (true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }else {
                System.out.println("You must be type Yes(Y) or No(N)");
            }
        }
    }

    public int checkIdExit(ArrayList<ShopItem> si, String id){
        int result = -1;
        for(var x: si){
            if (x.getId().compareTo(id)==0){
                result = si.indexOf(x);
            }
        }
        if(result == -1){
            System.out.println("Cannot find because id not exist");
        }

        return result;
    }
}
