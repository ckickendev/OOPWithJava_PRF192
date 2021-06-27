package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai10D;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public BookList(){
        Book book1 = new Book(1,"hihi","maradona", 3000);
        Book book2 = new Book(2,"hihi","messi", 3000);
        Book book3 = new Book(3,"hihi","ronaldo", 3000);
        Book book4 = new Book(4,"hihi","ronaldinho", 3000);
        Book book5 = new Book(5,"hihi","mbampe", 3000);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }

    public void addBook(){
        boolean coutinues= true;
        do{
            System.out.println("Enter ID books:");int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter title books:");String title = scanner.nextLine();
            System.out.println("Enter Author:");String author = scanner.nextLine();
            System.out.println("Enter price");int price = Integer.parseInt(scanner.nextLine());
            Book book = new Book(id,title,author,price);
            books.add(book);
            System.out.println("Do you want to countiues: Y or N ");
            String a = scanner.nextLine();
            if(a.equalsIgnoreCase("N")){
                coutinues = false;
            }else if(a.equalsIgnoreCase("Y")){
                coutinues = true;
            }else {
                System.out.println("Please choose Y or N");
            }
        }while (coutinues);
    }

    public void display(){
        for (Book pointer : books) {
            System.out.println("" + pointer);
        }
    }

    public void update(){
        System.out.println("Please input id books");
        int id = Integer.parseInt(scanner.nextLine());
        if(findIdExits(id)==null){
            System.out.println("Cannot find the books");
            return;
        }
        System.out.println("Infor after update");
        Book old = findIdExits(id);
        System.out.println(findIdExits(id));
        System.out.println("Enter ID books:");int id1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter title books:");String title = scanner.nextLine();
        System.out.println("Enter Author:");String author = scanner.nextLine();
        System.out.println("Enter price");int price = Integer.parseInt(scanner.nextLine());
        Book newbook = new Book(id1,title,author,price);
        books.set(books.indexOf(old), newbook);
        System.out.println("Update succes/n Information after update");
        System.out.println(newbook);
    }

    public Book findIdExits(int ID){
        for (var x: books){
            if (x.getId() == ID){
                return x;
            }
        }
        return null;
    }

    public void delete(){
        System.out.println("Enter ID to remove");
        int id = Integer.parseInt(scanner.nextLine());
        int position = books.indexOf(findIdExits(id));
        books.remove(position);
        display();
    }
}
