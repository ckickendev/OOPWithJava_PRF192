package Semeter2_OOP_With_Jav_a.WS10.Doctor10;

public class Menu {
    public static int get() {
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputIntLimit(1, 5);
    }
}
