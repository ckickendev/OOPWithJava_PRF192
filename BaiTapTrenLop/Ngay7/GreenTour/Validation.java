package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    public static final Scanner scanner = new Scanner(System.in);
    public int checkInputLimit(int min, int max){
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputString(){
        while(true){
            String result = scanner.nextLine().trim();
            if(!result.isEmpty()){
                return result;
            }else {
                System.out.println("Not null");
                System.out.println("Please check again");
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
            }else{
                System.out.println("Must be Yes(Y) or No(N)");
                System.out.println("Enter again");
            }
        }
    }

    public int checkInputInt(){
        while (true){
            try{
                int result = Integer.parseInt(scanner.nextLine());
                return result;
            }catch (NumberFormatException e){
                System.err.println("Must be input integer.");
                System.err.println("Please check again");
            }
        }
    }

    public long checkInputLong(){
        while (true){
            try{
                long result = Long.parseLong(scanner.nextLine());
                return result;
            }catch (NumberFormatException e){
                System.err.println("Must be input integer.");
                System.err.println("Please check again");
            }
        }
    }

    public String checkInputCode(){
        String result = checkInputString();
        if(result.length()!=4){
            System.out.println("Tour's code must have 4 characters");
            System.out.println("Enter again: ");
            checkInputCode();
        }
        return result;
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



    public String checkInputTransport(){
        String result;
        while(true){
            System.out.print("Do you want to travel by airplane(Y/N): ");
            result = checkInputString();
            if(result.equalsIgnoreCase("Y")){
                return "AirPlane";
            }else {
                return "Other";
            }
        }
    }

}
