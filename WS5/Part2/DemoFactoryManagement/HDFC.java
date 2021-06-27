package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME = "HDFC BANK";
    }

    public String getBankName(){
        return BNAME;
    }
}
