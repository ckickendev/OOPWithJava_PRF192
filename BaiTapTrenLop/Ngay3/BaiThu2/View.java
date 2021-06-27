package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.BaiThu2;

import java.util.Date;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap customer");
        System.out.println("Nhap ten: "); String name = scanner.nextLine();
        Customer customer = new Customer(name);
        System.out.println("La khach hang hay khong:(true or false): "); boolean ss = scanner.nextBoolean();
        scanner.nextLine();
        customer.setA(ss);
        System.out.println("Loai khach hang:(Premium , Gold ,Silver or other ) :");
        String type =scanner.nextLine();
        customer.setMemberType(type);



        Date d2 = new Date(2323223232L);
        Visit visit = new Visit(customer, d2);

        visit.setProductExpense(1000);
        visit.setServiceExpense(1500);

        DiscountRate discountRate = new DiscountRate();

        System.out.println(" "+visit.getTotalExpense());


        System.out.println(customer);

    }
}
