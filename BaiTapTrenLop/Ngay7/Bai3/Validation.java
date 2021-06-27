package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private final static Scanner scanner = new Scanner(System.in);
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

    public char checkInputUD(){
        while(true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("U")){
                return 'U';
            }else if(result.equalsIgnoreCase("D")){
                return 'D';
            }else {
                System.out.println("Must be 'U' or 'D'");
                System.out.println("Please check again");
            }
        }
    }

    public String checkInputCourse(){
        while (true){
            String result = checkInputString();
            if (result.equalsIgnoreCase("java")
            || result.equalsIgnoreCase(".net")
            || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }

    public int checkIDExist(ArrayList<Student> students, String id){
        for(var x: students){
            if(x.getId().equalsIgnoreCase(id)){
                return students.indexOf(x);
            }
        }
        return -1;
    }

}
