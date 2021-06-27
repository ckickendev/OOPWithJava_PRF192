package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.AccountMenu;

public class View {
    public static void main(String[] args) {
        Acount acount = new Acount("1", "DucDo");
        Acount another = new Acount("2", "Dung", 1000);
        acount.credit(1000);
        System.out.println("after add: ");
        System.out.println(acount);
        acount.debit(100);
        System.out.println("after tru");
        System.out.println(acount);
        acount.tranferTo(another,100);
        System.out.println("info me");
        System.out.println(acount);
        System.out.println("info another");
        System.out.println(another);
    }

}
