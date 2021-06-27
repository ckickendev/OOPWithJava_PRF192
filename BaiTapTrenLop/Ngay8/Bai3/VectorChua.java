package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class VectorChua {
    Vector<Object> Items = new Vector<>();
    Vector<Book> books = new Vector<>();
    Vector<Cake> cakes = new Vector<>();
    Vector<Flower> flowers = new Vector<>();
    Validation validation = new Validation();
    File file;
    DataControler dataControler = new DataControler();



    public VectorChua() throws IOException {
        file = new File("FILESAVE.DAT");
        File fileBook = new File("BookList.DAT");
        File fileCake = new File("CakeList.DAT");
        File fileFlower = new File("FlowerList.DAT");

        Book book1 = new Book("111", "DucDo", "HTML", 12.5);
        Book book2 = new Book("222", "DucDo", "CSS", 13);
        Cake cake = new Cake("333", "TrungDung", "TrungDung", 15);
        Flower flower = new Flower("444", "DucDo", "Hue", "Red", 15);

        Items.add(book1);
        Items.add(book2);
        Items.add(cake);
        Items.add(flower);

    }

    public void add() throws Exception{
        System.out.println("Add Book(1), Cake(2) hay Flower(3): ");
        int choice = validation.checkInputIntLimit(1,3);
        switch (choice){
            case 1:{
                System.out.print("Please input id: ");String id = validation.checkInputString();
                System.out.print("Please input author: ");String author = validation.checkInputString();
                System.out.print("Please input title: ");String title = validation.checkInputString();
                System.out.print("Please input price: ");double price = validation.checkInputDouble();
                Book book = new Book(id, author, title, price);
                Items.add(book);
                dataControler.writeToFile(Items);
                dataControler.writeToFile("BookList.DAT", book);
                break;
            }
            case 2:{
                System.out.print("Please input id: ");String id = validation.checkInputString();
                System.out.print("Please input name: ");String name = validation.checkInputString();
                System.out.print("Please input brand: ");String brand = validation.checkInputString();
                System.out.print("Please input price: ");double price = validation.checkInputDouble();
                Cake cake = new Cake(id, name, brand, price);
                Items.add(cake);
                dataControler.writeToFile(Items);
                dataControler.writeToFile("CakeList.DAT", cake);
                break;
            }
            case 3:{
                System.out.print("Please input id: ");String id = validation.checkInputString();
                System.out.print("Please input name: ");String name = validation.checkInputString();
                System.out.print("Please input local: ");String local = validation.checkInputString();
                System.out.print("Please input color: ");String color = validation.checkInputString();
                System.out.print("Please input price: ");double price = validation.checkInputDouble();
                Flower flower = new Flower(id, name, local,color, price);
                Items.add(flower);
                dataControler.writeToFile(Items);
                dataControler.writeToFile("FlowerList.DAT", flower);
                break;
            }
        }
    }

    public void remove(){
        System.out.println("Enter id you want to remove: ");
        String idRemove = validation.checkInputString();
        for (var x: Items){
            if (x instanceof Book){
                if(((Book) x).getId().equalsIgnoreCase(idRemove)){
                    Items.remove(x);
                }
            }else if(x instanceof Cake){
                if(((Cake) x).getId().equalsIgnoreCase(idRemove)){
                    Items.remove(x);
                }
            }else if(x instanceof Flower){
                if(((Flower) x).getId().equalsIgnoreCase(idRemove)){
                    Items.remove(x);
                }
            }
        }
    }

    public void readFromFile() throws IOException, ClassNotFoundException {
        System.out.println("Select type: Book(1) Cake(2) Flower(3): ");
        int choice = validation.checkInputIntLimit(1,3);
        switch (choice){
            case 1:{
                dataControler.readFromFile("BookList.DAT");
                break;
            }
            case 2:{
                dataControler.readFromFile("CakeList.DAT");
                break;
            }
            case 3:{
                dataControler.readFromFile("FlowerList.DAT");
                break;
            }
        }
    }
}
