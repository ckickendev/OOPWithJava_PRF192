package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

import java.util.Scanner;


public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.nextLine();
        System.out.println("Enter the type of loan you want to take, like home loan or bussiness loan or education loan");
        String loanName = br.nextLine();


        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.println(bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        LOAN loan = loanFactory.getLoan(loanName);
        System.out.println("Enter the interest rate for bank: ");double interest = Double.parseDouble(br.nextLine());
        System.out.println("Enter the loan amount: ");double amount = Double.parseDouble(br.nextLine());
        System.out.println("Enter number of years: ");int year = Integer.parseInt(br.nextLine());
        loan.getInterestRate(interest);
        loan.calculateLoanPayment(amount, year);



    }
}
