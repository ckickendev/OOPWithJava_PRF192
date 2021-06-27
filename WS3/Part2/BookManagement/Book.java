package Semeter2_OOP_With_Jav_a.WS3.Part2.BookManagement;

public class Book {
    private String nameBook;
    private Author author;
    private double priceBook;
    private int qty;

    public Book(String nameBook, Author author, double priceBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.priceBook = priceBook;
    }

    public Book(String nameBook, Author author, double priceBook, int qty) {
        this.nameBook = nameBook;
        this.author = author;
        this.priceBook = priceBook;
        this.qty = qty;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(double priceBook) {
        this.priceBook = priceBook;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public char getAuthorGender(){
        return author.getGender();
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author.toString() +
                ", priceBook=" + priceBook +
                ", qty=" + qty +
                '}';
    }
}
