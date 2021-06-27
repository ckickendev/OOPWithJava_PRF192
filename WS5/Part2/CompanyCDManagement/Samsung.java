package Semeter2_OOP_With_Jav_a.WS5.Part2.CompanyCDManagement;

public class Samsung extends Company implements Packing{
    public String pack(){
        return "Samsung CD";
    }
    public int price(){
        return 20;
    }
}
