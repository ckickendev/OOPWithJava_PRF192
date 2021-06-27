package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Store {
    ArrayList<ShopItem> shopItems = new ArrayList<>();
    Validation validation = new Validation();
    FileController fileController = new FileController();
    File file = new File("STORE.DAT");
    String storeFile = "STORE.DAT";

    public Store() throws IOException {
        Book book1 = new Book("111", "Mamamoo", 1, 10,0.5);
        Book book2 = new Book("222", "BlackPink", 1.2, 10,1.5);
        Book book3 = new Book("333", "GFriend", 3.2, 10,0.8);
        Book book4 = new Book("444", "APink", 2, 10,1.1);
        Software software = new Software("555","Red Velvet",2.1,10,3);
        shopItems.add(book1);
        shopItems.add(book2);
        shopItems.add(book3);
        shopItems.add(book4);
        shopItems.add(software);
        fileController.writeBookToFile(book1, storeFile);
        fileController.writeBookToFile(book2, storeFile);
        fileController.writeBookToFile(book3, storeFile);
        fileController.writeBookToFile(book4, storeFile);
        fileController.writeSoftwareToFile(software, storeFile);
        fileController.updateItemsFromFile(shopItems, storeFile);
        Collections.sort(shopItems);
    }


    public void addItems() throws IOException {
        while (true){
            Collections.sort(shopItems);
            System.out.println("1.Add book");
            System.out.println("2.Add Software");
            System.out.println("3.Exit");
            int choice = validation.checkInputIntLimit(1,3);
            switch (choice){
                case 1: {
                    System.out.println("Input book:");
                    System.out.print("Please input id: ");String id = validation.checkInputString();
                    System.out.print("Please input name: ");String name = validation.checkInputString();
                    System.out.print("Please input price: ");double price = validation.checkInputDouble();
                    System.out.print("Please input Qtt: ");int Qtt = validation.checkInputInt();
                    System.out.print("Please input weight of book: ");double weight = validation.checkInputDouble();
                    Book book = new Book(id, name, price, Qtt, weight);
                    shopItems.add(book);
                    fileController.writeBookToFile(book, storeFile);
                    break;
                }
                case 2: {
                    System.out.println("Input Software");
                    System.out.print("Please input id: ");String id = validation.checkInputString();
                    System.out.print("Please input name: ");String name = validation.checkInputString();
                    System.out.print("Please input price: ");double price = validation.checkInputDouble();
                    System.out.print("Please input Qtt: ");int qtt = validation.checkInputInt();
                    System.out.print("Please input number of cd ");int nocd = validation.checkInputInt();
                    Software software = new Software(id, name, price, qtt, nocd);
                    shopItems.add(software);
                    fileController.writeSoftwareToFile(software, storeFile);
                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }

    public void displayListItems(){
        Collections.sort(shopItems);
        System.out.println(" ");
        Collections.sort(shopItems);
        System.out.println("There are "+ shopItems.size() +" items");
        for(var x: shopItems){
            System.out.print((shopItems.indexOf(x)+1)+"-");
            System.out.println(x);
        }
        System.out.println(" ");
    }

    public void readFromFile() throws IOException {
        ArrayList<ShopItem> shopItems = fileController.readShopItemFromFile(storeFile);
        System.out.println("Shop items read from file !!!");
        for(var x: shopItems){
            System.out.println(x);
        }
    }

    public void updateItems() throws IOException {
        Collections.sort(shopItems);
        System.out.print("Enter Id: ");
        String id = validation.checkInputString();
        int count = 0;
        for(int i=0; i<shopItems.size(); i++){
            if(shopItems.get(i).getId().equalsIgnoreCase(id)){
                System.out.println("Find out the id, Do you want to update? Y/N");
                if (validation.checkInputYN()){
                    if(shopItems.get(i) instanceof Book){
                        System.out.print("Input book:");
                        System.out.print("Please input id: ");String idbook = validation.checkInputString();
                        System.out.print("Please input name: ");String name = validation.checkInputString();
                        System.out.print("Please input price: ");double price = validation.checkInputDouble();
                        System.out.print("Please input Qtt: ");int Qtt = validation.checkInputInt();
                        System.out.print("Please input weight of book: ");double weight = validation.checkInputDouble();
                        Book book = new Book(idbook, name, price, Qtt, weight);
                        shopItems.set(i, book);
                        fileController.updateItemsFromFile(shopItems, storeFile);
                        count++;
                    }else if(shopItems.get(i) instanceof Software){
                        System.out.print("Input Software");
                        System.out.print("Please input id: ");String idsoftware = validation.checkInputString();
                        System.out.print("Please input name: ");String name = validation.checkInputString();
                        System.out.print("Please input price: ");double price = validation.checkInputDouble();
                        System.out.print("Please input Qtt: ");int qtt = validation.checkInputInt();
                        System.out.print("Please input number of cd ");int nocd = validation.checkInputInt();
                        Software software = new Software(idsoftware, name, price, qtt, nocd);
                        shopItems.set(i, software);
                        fileController.updateItemsFromFile(shopItems, storeFile);
                        count++;
                    }
                }else {
                    System.out.println("You have deny");
                    return;
                }
            }
        }
        if(count==0){
            System.out.println("No have id found");
        }
    }

    public void removeItem() throws IOException {
        Collections.sort(shopItems);
        if(shopItems.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Please input id you want to remove");
        String id = validation.checkInputString();
        int count =0 ;
        for(int i=0; i<shopItems.size(); i++){
            if(shopItems.get(i).getId().equalsIgnoreCase(id)){
                shopItems.remove(i);
                fileController.updateItemsFromFile(shopItems, storeFile);
                count++;
            }
        }
        if(count==0){
            System.out.println("Cannot find item by this id");
        }
    }

    public ArrayList<ShopItem> getShopItems() {
        return shopItems;
    }

    public void setShopItems(ArrayList<ShopItem> shopItems) {
        this.shopItems = shopItems;
    }

    public String getStoreFile() {
        return storeFile;
    }

    public void setStoreFile(String storeFile) {
        this.storeFile = storeFile;
    }
}
