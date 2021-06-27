package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.InvoiceItem;

public class View {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("DE150067", "ASD", 15, 100007);
        System.out.println(invoice + "" + invoice.getTotal());
    }
}
