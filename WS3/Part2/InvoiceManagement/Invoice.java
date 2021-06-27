package Semeter2_OOP_With_Jav_a.WS3.Part2.InvoiceManagement;

public class Invoice {
    private int IdInvoice;
    private Customer customer;
    private double amount;

    public Invoice(int idInvoice, Customer customer, double amount) {
        IdInvoice = idInvoice;
        this.customer = customer;
        this.amount = amount;
    }

    public int getIdInvoice() {
        return IdInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        IdInvoice = idInvoice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getAmountAfterDiscount(){
        return amount*(1-customer.getDiscount()/100.0);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "IdInvoice=" + IdInvoice +
                ", customer=" + customer +
                ", amount=" + getAmountAfterDiscount() +
                '}';
    }
}
