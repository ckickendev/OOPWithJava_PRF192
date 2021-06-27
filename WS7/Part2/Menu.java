package Semeter2_OOP_With_Jav_a.WS7.Part2;

public class Menu {
    Validation validation = new Validation();
    public int callMenu(){
        System.out.println("Menu");
        System.out.println("1.Add student.");
        System.out.println("2.Find and sort.");
        System.out.println("3.Update or delete.");
        System.out.println("4.Report.");
        System.out.println("5.Exit.");
        int choice = validation.checkInputIntLimit(1,5);
        return choice;
    }
}
