package Semeter2_OOP_With_Jav_a.WS3.Part2.InvoiceManagement;

public class View {
    public static void main(String[] args) {
        Customer customer = new Customer(150067, "DucDo", 15);
        Invoice invoice = new Invoice(003, customer, 1000000);
        System.out.println(invoice);
    }
}
