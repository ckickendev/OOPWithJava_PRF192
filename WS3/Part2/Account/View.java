package Semeter2_OOP_With_Jav_a.WS3.Part2.Account;

public class View {
    public static void main(String[] args) {
        Acount acount = new Acount("1", "DucDo");
        Acount another = new Acount("2", "Dung", 1000);
        acount.credit(1000);
        System.out.println("After add: ");
        System.out.println(acount);
        acount.debit(100);
        System.out.println("After sub ");
        System.out.println(acount);
        System.out.println("After transfer: ");
        acount.tranferTo(another,100);
        System.out.println("Info me: ");
        System.out.println(acount);
        System.out.println("Info another: ");
        System.out.println(another);
    }

}
