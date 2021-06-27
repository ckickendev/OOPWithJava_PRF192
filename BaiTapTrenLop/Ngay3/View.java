package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atomic;
        ArrayList<Atom> atoms = new ArrayList<>();
        ManagerAtom managerAtom = new ManagerAtom(atoms);
        do{
            System.out.print("Enter atomic number: "); atomic = scanner.nextInt();scanner.nextLine();
            if(atomic==0){
                break;
            }
            System.out.print("Enter symbol: ");String symbol =  scanner.nextLine();
            System.out.print("Enter full name: ");String name = scanner.nextLine();
            System.out.print("Enter atomic weight :");float weight = scanner.nextFloat();
            System.out.println("------------------------------------");
            Atom atom = new Atom(atomic,symbol,name,weight);
            managerAtom.addAtom(atom);
        }while(atomic != 0);
        System.out.println("List of Atom: ");
        managerAtom.printallAtom();
    }
}
