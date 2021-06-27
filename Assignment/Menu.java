package Semeter2_OOP_With_Jav_a.Assignment;

public class Menu {
    Validation validation = new Validation();
    public int menuChoice(){
        System.out.println("Menu: ");
        System.out.println("1.Add a patient.");
        System.out.println("2.Computer fee average of all the in-patients.");
        System.out.println("3.List out-patient information including hospital’s fee.");
        System.out.println("4.Search the last occurrence of the patient having minimum hospital’s fee");
        System.out.println("5.Remove the in-patients released from hospital after specified date.");
        System.out.println("6.Exit");
        System.out.println("Please type your choice: ");
        int choice = validation.checkInputIntLimit(1,6);
        return choice;
    }
}
