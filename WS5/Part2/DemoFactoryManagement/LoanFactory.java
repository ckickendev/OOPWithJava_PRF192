package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

public class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank) {
        return null;
    }

    public LOAN getLoan(String loan) {
        if(loan == null){
            return null;
        }
        else if(loan.equalsIgnoreCase("HOMELOAN")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("Educationloan")){
            return new EducationLoan();
        }
        else if(loan.equalsIgnoreCase("Bussinessloan")){
            return new BussinessLoan();
        }
        return null;
    }
}
