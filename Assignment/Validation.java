package Semeter2_OOP_With_Jav_a.Assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    public final Scanner scanner = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max){
        while(true){
            int result = Integer.parseInt(scanner.nextLine().trim());
            if(result<min || result>max){
                System.out.println("Your input wrong, must be in range: "+ min +" and "+ max);
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
                System.out.println("Invalid value\n Please check again");
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

    public String checkInputGender(){
        while (true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("MALE")){
                return result;
            }else if(result.equalsIgnoreCase("FEMALE")){
                return result;
            }else {
                System.out.println("Must be Male or Female/n Please input again !!!");
            }
        }
    }

    public Date checkInputDate(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String result = checkInputString();
        Date date = new Date();
        try{
            date = formater.parse(result);
        }catch (ParseException e){
            System.err.println("Please input in format (dd/MM/yyyy)");
            System.out.print("Enter again: ");
            checkInputDate();
        }
        return date;
    }



    public int checkIdExit(ArrayList<Patient> si, String id){
        int result = -1;
        for(var x: si){
            if (x.getCode().compareTo(id)==0){
                result = si.indexOf(x);
            }
        }
        if(result == -1){
            System.out.println("Code not exist, you can continue!");
        }

        return result;
    }
}
