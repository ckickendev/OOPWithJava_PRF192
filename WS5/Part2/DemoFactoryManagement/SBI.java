package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class SBI implements Bank{
    public final String BNAME;

    public SBI(){
        BNAME="SBI BANK";
    }

    public String getBankName(){
        return BNAME;
    }
}
