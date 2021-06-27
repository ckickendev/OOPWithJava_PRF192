package Semeter2_OOP_With_Jav_a.WS5.Part2.BankManagement;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee emp1 = new Cashier(121, "Duc Do", 30000.0);
        Employee emp2 = new Cashier(132, "Trung Dung", 34000.0);
        Employee emp3 = new Accountant(113, "Hoang Thinh", 50000.0);
        Employee manager1 = new BankManager(100, "Dark Thien", 230000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.display();
    }

}
