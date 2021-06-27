package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class ICICI implements Bank {
    public final String BNAME;
    public ICICI(){
        BNAME = "ICICI BANK";
    }

    public String getBankName(){
        return BNAME;
    }
}
