package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.BaiKT06;

import java.util.Scanner;

public class Validation {
    private Scanner scanner = new Scanner(System.in);
    private String ValidPhone = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}";
    private String ValidMail = "^[a-zA-Z][\\w]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    private String ValidDOB = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    private String ValidID = "^[a-zA-Z]\\d{2}$";

    public String checkInputString(){
        while (true){
            String result = scanner.nextLine();
            if(!result.isEmpty()){
                return result;
            }else {
                System.out.println("Invalid");
                System.out.println("Please check again ");
            }
        }
    }

    public String checkEmail(){
        while (true){
            String result = checkInputString();
            if(result.matches(ValidMail)){
                return result;
            }else {
                System.out.println("Invalid email");
                System.out.println("Please check again follow form: xxx@.xxx.xxx");
            }
        }
    }

    public String checkPhoneNumber(){
        while (true){
            String result = checkInputString();
            if(result.matches(ValidPhone)){
                return result;
            }else {
                System.out.println("Invalid phone number");
                System.out.println("Please check again follow form: xxx-xxx-xxxx");
            }
        }
    }

    public String checkDOB(){
        while (true){
            String result = checkInputString();
            if(result.matches(ValidDOB)){
                return result;
            }else{
                System.out.println("Invalid day of birth");
                System.out.println("Please check again follow form: xx-xx-xxxx");
            }
        }
    }

    public String checkID(){
        while (true){
            String result = checkInputString();
            if(result.matches(ValidID)){
                return result;
            }else {
                System.out.println("Invalid ID");
                System.out.println("Please check again follow form: xxxdd");
            }
        }
    }

}
