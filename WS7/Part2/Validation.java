package Semeter2_OOP_With_Jav_a.WS7.Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private final Scanner scanner = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max){
        while (true){
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if(result<min && result>max){
                    throw new NumberFormatException();
                }
                return result;
            }catch (NumberFormatException e){
                System.out.println("Please input again");
            }
        }
    }

    public String checkInputString(){
        while(true){
            String result = scanner.nextLine();
            if (!result.isEmpty()){
                return result;
            }else {
                System.out.println("Must not null");
                System.out.println("Please input again");
            }
        }
    }

    public boolean checkInputYesNo(){
        while(true){
            String result = scanner.nextLine();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }else {
                System.out.println("Must be yes(Y) or No(N) ");
                System.out.println("Please check again");
            }
        }
    }

    public char checkInputUD(){
        while (true){
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")){
                return 'U';
            }else if(result.equalsIgnoreCase("D")){
                return 'D';
            }else {
                System.out.println("Please input u/U or d/D character");
                System.out.println("Please input again");
            }
        }
    }

    public String checkInputCourse(){
        while (true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("java")||
            result.equalsIgnoreCase(".net")||
            result.equalsIgnoreCase("c/c++")){
                return result;
            }
            System.out.println("There are only three courses : java, .net and c/c++");
            System.out.println("Enter again");
        }
    }

    public int checkIdExist(ArrayList<Student> students,String id){
        int result = -1;
        for (var x : students){
            if (x.getId().equalsIgnoreCase(id)){
                result = students.indexOf(x);
            }
        }
        return result;
    }
}
