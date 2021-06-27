package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String Bank){
        if(Bank == null){
            return null;
        }else if (Bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }else if (Bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        }else if(Bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }

    public LOAN getLoan(String Loan){
        return null;
    }
}
