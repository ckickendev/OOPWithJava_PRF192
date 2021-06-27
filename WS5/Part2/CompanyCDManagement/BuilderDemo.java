package Semeter2_OOP_With_Jav_a.WS5.Part2.CompanyCDManagement;

public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType = cdBuilder.buildSonyCD();
        cdType.addItems(new Sony());
        cdType.addItems(new Sony());
        cdType.addItems(new Samsung());
        cdType.addItems(new Samsung());
        cdType.addItems(new Sony());
        cdType.addItems(new Samsung());
        cdType.addItems(new Sony());
        cdType.addItems(new Samsung());
        cdType.addItems(new Sony());
        cdType.getCost();
        cdType.showItems();


    }
}
