package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.SolveAccount;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        Account account = new Account();
        System.out.println("-------Menu-------");
        System.out.println("0.Add Acount");
        System.out.println("1.Show info");
        System.out.println("2.Add money");
        System.out.println("3.Draw money");
        System.out.println("4.Exit");
        int select;
        do{
            System.out.println("Please choose select");
            select = scanner.nextInt();scanner.nextLine();
            switch (select){
                case 0:{
                    System.out.println("Please input your information:");
                    System.out.println("Enter your ID: ");int id = scanner.nextInt();scanner.nextLine();
                    System.out.println("Enter your name: "); String name = scanner.nextLine();
                    System.out.println("Enter your gender: "); Character Gender = scanner.next().charAt(0); scanner.nextLine();
                    customer.setID(id);
                    customer.setGender(Gender);
                    customer.setName(name);
//                    customer = new Customer(id, name, Gender);
                    System.out.println("Enter account ID: "); int accountID = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Enter balance: ");int accountBalance = scanner.nextInt();scanner.nextLine();
//                    account = new Account(accountID, customer, accountBalance);
                    account.setId(accountID);
                    account.setBalance(accountBalance);
                    account.setCustomer(customer);
                    break;
                }

                case 1:{
                    System.out.println();
                    System.out.println("Information: ");
                    System.out.println(account);
                    break;
                }

                case 2:{
                    System.out.println("Enter amount to add: ");int amountAdd = scanner.nextInt();scanner.nextLine();
                    account.deposit(amountAdd);
                    System.out.println("After deposit :");
                    System.out.println(account);
                    break;
                }
                case 3:{
                    System.out.println("Enter amout to sub"); int amoutSub = scanner.nextInt();scanner.nextLine();
                    account.withdraw(amoutSub);
                    System.out.println(account);
                    break;
                }
            }
        }while(select!=4);

    }
}
