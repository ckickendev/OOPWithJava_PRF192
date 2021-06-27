package Semeter2_OOP_With_Jav_a.WS5.Part1.PhoneManagement;

public class IntPhoneNumber extends PhoneNumber{
    String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(int area, String number, String countryCode) {
        super(area, number);
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "IntPhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", are=" + area +
                ", number='" + number + '\'' +
                '}';
    }

    public IntPhoneNumber inputData(){
        System.out.println("Input country code:");
        String countryCode = Validation.checkInputString();
        System.out.println("Enter code here:");
        int area = Validation.scanner.nextInt();
        Validation.scanner.nextLine();
        System.out.print("Enter number: ");
        String number = Validation.checkInputPhone();
        IntPhoneNumber intPhoneNumber = new IntPhoneNumber(area, number, countryCode);
        return intPhoneNumber;
    }

    public void display(){
        System.out.println("Country code"+ countryCode);
        System.out.println("Phone number: " + number);
        System.out.println("Area: " + area);
    }
}
