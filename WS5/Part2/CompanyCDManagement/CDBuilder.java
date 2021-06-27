package Semeter2_OOP_With_Jav_a.WS5.Part2.CompanyCDManagement;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItems(new Sony());
        return cds;
    }

    public CDType buildSamsungCD(){
        CDType cds = new CDType();
        cds.addItems(new Samsung());
        return cds;
    }
}
