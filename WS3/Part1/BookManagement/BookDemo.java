package Semeter2_OOP_With_Jav_a.WS3.Part1.BookManagement;

public class BookDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        Book book = new Book();
        Author author = new Author("Conan Doyle");
        book.setAuthor(author);
        System.out.println("Author : "+ book.getAuthor().getName());
        book.setTitle("Sherlock holmes");
        System.out.println("Title : "+ book.getTitle());
        book.setFiction(true);
        System.out.println("Is fiction : " + book.isFiction());
        book.setNoOfPages(500);
        System.out.println("Number of pages: "+ book.getNoOfPages());
    }
}
