package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.AccountMenu;

public class Acount {
    private String id;
    private String name;
    private int balance=0;

    public Acount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Acount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount){
        if(amount<=balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Not enough");
        }
        return balance;
    }

    public int tranferTo(Acount another, int amount){
        if(amount<=balance){
            balance = balance - amount;
            another.balance += amount;
        }
        else{
            System.out.println("Not enough");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
