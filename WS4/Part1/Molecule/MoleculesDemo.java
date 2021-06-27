package Semeter2_OOP_With_Jav_a.WS4.Part1.Molecule;

public class MoleculesDemo {
    public static void main(String[] args) {
        System.out.println("Enter structure");
        String structure = Validation.checkInputString();
        System.out.println("Enter name");
        String name = Validation.checkInputString();
        System.out.println("Enter weight");
        float weight = Validation.checkInputFloat();
        Molecule molecule = new Molecule(structure,name,weight);
        molecule.display();
    }
}
