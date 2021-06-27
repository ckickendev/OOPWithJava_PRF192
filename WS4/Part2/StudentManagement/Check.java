package Semeter2_OOP_With_Jav_a.WS4.Part2.StudentManagement;

import java.util.Scanner;

public class Check {
    public static Scanner scanner = new Scanner(System.in);

    public static String checkString(){
        while (true){
            String result = scanner.nextLine();
            if(result!=null){
                return result;
            }
            else {
                System.out.println("Must be a string");
                System.out.println("Please check again");
            }
        }
    }

    public static int checkInputLimit(int min, int max){
        while (true){
            int result=Integer.parseInt(scanner.nextLine().trim());
            if(result>=min && result<=max ){
                return result;
            }
            else{
                System.out.println("Not in the range\nCheck again");
            }
        }
    }

    public static int checkInterger(){
        while (true){
            int result = Integer.parseInt(scanner.nextLine().trim());
            if (String.valueOf(result)!=null){
                return result;
            }
            else {
                System.out.println("Must be not null\n Please check again");
            }
        }
    }

    public static boolean checkYesNo(){
        while (true){
            String result= Check.checkString();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }
            else if(result.equalsIgnoreCase("N")){
                return false;
            }
            else{
                System.out.println("String must be Y/N \n Check again");
            }
        }
    }

    public static String checkCourseName(){
        while (true){
            String result=Check.checkString();
            if(result.equalsIgnoreCase("java") || result.equalsIgnoreCase(".net")||
            result.equalsIgnoreCase("C/C++")){
                return result;
            }
            else {
                System.out.println("Must be Java , .Net or C/C++ \n Please check again");
            }
        }
    }
}
