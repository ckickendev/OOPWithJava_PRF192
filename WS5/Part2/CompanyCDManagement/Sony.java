package Semeter2_OOP_With_Jav_a.WS5.Part2.CompanyCDManagement;

public class Sony extends Company implements Packing{
    public String pack(){
        return "Sony CD";
    }
    public int price(){
        return 10;
    }

}
