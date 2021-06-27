package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai4;


public class Menu {
    Validation validation = new Validation();
    public int menuALl(){
        System.out.println("Enter role: ");
        System.out.println("1.Car. ");
        System.out.println("2.Flower. ");
        System.out.println("3.Exit. ");
        int x = validation.checkInputIntLimit(1,2);
        return x;
    }

    public int menuCar(){
        System.out.println("");
        System.out.println("1.Add ");
        System.out.println("2.Display ");
        System.out.println("3.Get Size ");
        System.out.println("4.Check empty ");
        System.out.println("5.Delete ");
        System.out.println("6.Exit");
        System.out.println("Enter choice: ");
        int x = validation.checkInputIntLimit(1,6);
        return x;
    }

    public int menuFlower(){
        System.out.println("");
        System.out.println("1.Add ");
        System.out.println("2.Display ");
        System.out.println("3.Sort ");
        System.out.println("4.Search ");
        System.out.println("5.Delete ");
        System.out.println("6.Exit ");
        System.out.println("Enter choice");
        int x = validation.checkInputIntLimit(1,6);
        return x;
    }
}
