package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("bank")){
            return new BankFactory();
        }else if(choice.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }
        return null;
    }
}
