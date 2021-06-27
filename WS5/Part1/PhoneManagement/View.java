package Semeter2_OOP_With_Jav_a.WS5.Part1.PhoneManagement;

public class View {
    public static void main(String[] args) {
        PhoneNumber[] numberlist = new PhoneNumber[100];
        int count = 0 ;
        while(true){
            System.out.println("Type of phone number : 1.Local phone\n 2.Inter phone \n 0.Exit");
            int choice = Validation.scanner.nextInt();
            Validation.scanner.nextLine();
            if(choice==1){
                PhoneNumber phoneNumber = new PhoneNumber();
                numberlist[count] = phoneNumber.inputData();
                ++count;
            }
            else if(choice==2){
                IntPhoneNumber intPhoneNumber = new IntPhoneNumber();
                numberlist[count] = intPhoneNumber.inputData();
                ++count;
            }
            else break;
        }
        System.out.println("List of number: ");
        for(int i=0; i<count; i++){
            System.out.println(numberlist[i]);
        }
    }
}
