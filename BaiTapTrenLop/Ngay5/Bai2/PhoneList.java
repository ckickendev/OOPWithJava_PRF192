package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai2;

import java.util.Scanner;

public class PhoneList {
    public static Scanner scanner = new Scanner(System.in);
    PhoneNumber[] phoneNumbers = new PhoneNumber[20];
    static int count = 0;


    public void enterPhone(){
        System.out.println("Interphone or Localphone: ");
        String phonetype = scanner.nextLine();
        if(phonetype.equalsIgnoreCase("INTERPHONE")){
            System.out.println("Enter Area code:");int area = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number:"); String number = scanner.nextLine();
            System.out.println("Enter countryCode: ");String countryCode = scanner.nextLine();
            IntePhoneNumber intePhoneNumber = new IntePhoneNumber(area,number,countryCode);
            phoneNumbers[count] = intePhoneNumber;
            ++count;
        }
        else if(phonetype.equalsIgnoreCase("LOCALPHONE")){
            System.out.println("Enter Area code:");int area = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number:"); String number = scanner.nextLine();
            System.out.println("Enter countryCode: ");String localCode = scanner.nextLine();
            LocaPhoneNumber locaPhoneNumber = new LocaPhoneNumber(area,number,localCode);
            phoneNumbers[count] = locaPhoneNumber;
            ++count;
        }
    }

    public void displayPhone(){
        System.out.println("List of Phone Number:");
        for (int i=0; i<count; i++){
            System.out.println(phoneNumbers[i]);
        }
    }

}
