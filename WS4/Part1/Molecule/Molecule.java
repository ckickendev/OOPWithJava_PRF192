package Semeter2_OOP_With_Jav_a.WS4.Part1.Molecule;

public class Molecule {
    private String structure;
    private String name;
    private float weight;

    public Molecule() {
    }

    public Molecule(String structure, String name, float weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println("Infomation: ");
        System.out.println("Structure: " +structure);
        System.out.println("Name: "+ name);
        System.out.println("Weight: " +weight);
    }
}
