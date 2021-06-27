package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

public class Manager {
    Validation validation = new Validation();
    public int Menu(){
        System.out.println("1. Admin roles");
        System.out.println("2. Customer roles");
        System.out.println("3. Exits");
        System.out.println("Enter your choice");
        int choice = validation.checkInputIntLimit(1,3);
        return choice;
    }

    public int menuForAdmin(){
        System.out.println("1. Add Items");
        System.out.println("2. Update Items");
        System.out.println("3. View Items");
        System.out.println("4. Remove Items");
        System.out.println("5. Read shop items from file");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1,6);
        return choice;
    }

    public int menuCustomer(){
        System.out.println("1. Add to Shopping Basket");
        System.out.println("2. Display the Shopping Basket");
        System.out.println("3. Remove from Shopping Basket");
        System.out.println("4. Print Invoice(Orders)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
