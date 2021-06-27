package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

public class Menu {
    Validation validation = new Validation();


    public int menuChoice() {
        System.out.println("Menu: ");
        System.out.println("1.Add ");
        System.out.println("2.Remove ");
        System.out.println("3.Read from file ");
        System.out.println("Choose your choice: ");
        int x = validation.checkInputIntLimit(1,3);
        return x;
    }
}
