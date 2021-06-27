package Semeter2_OOP_With_Jav_a.WS5.Part1.PhoneManagement;

public class PhoneNumber {
    int area;
    String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.area + " - " + this.number;
    }

    public PhoneNumber inputData(){
        System.out.println("Enter code here:");
        int area = Validation.scanner.nextInt();
        Validation.scanner.nextLine();
        System.out.print("Enter number: ");
        String number = Validation.checkInputPhone();
        PhoneNumber result = new PhoneNumber(area, number);
        return result;
    }

    public void display() {
        System.out.println("Phone number: " + number);
        System.out.println("Area: " + area);
    }
}
