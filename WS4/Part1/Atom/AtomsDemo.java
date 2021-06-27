package Semeter2_OOP_With_Jav_a.WS4.Part1.Atom;



public class AtomsDemo {
    static Atom[] atoms = new Atom[20];

    public static void enterData(){
        int i=0;
        while(true){
            System.out.println("Enter number");
            int number = Validation.checkinputInt();

            System.out.println("Enter Symbol");
            String symbol = Validation.checkinputString();
            System.out.println("Enter fullname");
            String fullname = Validation.checkinputString();
            System.out.println("Enter weight");
            Float weight = Validation.checkInputFloat();
            atoms[i] = new Atom(number,symbol,fullname,weight);
            i++;
            System.out.println("Do you want to continues: (Y/N)");
            if(Validation.accept()) {
                continue;
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        enterData();
       for( var x: atoms){
           System.out.println(x);
       }
    }
}
