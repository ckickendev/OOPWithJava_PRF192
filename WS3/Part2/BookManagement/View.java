package Semeter2_OOP_With_Jav_a.WS3.Part2.BookManagement;

public class View {
    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99); // Test Book' Constructor
        System.out.println(dummyBook); // Test Book's toString()
        // Test Getters and Setters
        dummyBook.setPriceBook(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getNameBook());
        System.out.println("price is: " + dummyBook.getPriceBook());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()


        //Try1:
        System.out.println(" ");
        System.out.println("Try 1: dummyBook");
        System.out.println("Author name: " + dummyBook.getAuthor().getName());
        System.out.println("Author email: " + dummyBook.getAuthor().getEmail());

        //TRy2:
        System.out.println(" ");
        System.out.println("Try 2: anotherBook ");
        System.out.println("Author name: "+ anotherBook.getAuthorName());
        System.out.println("Author email: "+ anotherBook.getAuthorEmail());

    }
}
