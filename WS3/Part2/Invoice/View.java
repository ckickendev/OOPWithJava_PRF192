package Semeter2_OOP_With_Jav_a.WS3.Part2.Invoice;

public class View {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("SSS333", "none",13, 15600.5);
        System.out.println("Total: " + invoiceItem.getTotal());
        System.out.println("All information");
        System.out.println(invoiceItem);
    }
}
