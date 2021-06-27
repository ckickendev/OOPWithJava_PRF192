package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void openFileToWrite(String filename) throws IOException {
        fileWriter = new FileWriter(filename, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
    }

    public void openFileToRead(String filename) throws IOException{
        scanner = new Scanner(Paths.get(filename), "UTF-8");
    }

    public void closeFileToRead(String filename) throws IOException {
        scanner.close();
    }

    public void closeFileToWrite(String filename) throws IOException {
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public void writeBookToFile(Book book, String filename) throws IOException {
        openFileToWrite(filename);
        printWriter.println("Book|"+book.getId()+"|"+book.getiName()+"|"+book.getPrice()+"|"
                +book.getiQtt()+"|"+book.getWeight());
        closeFileToWrite(filename);
    }


    public void writeSoftwareToFile(Software software, String filename) throws IOException{
        openFileToWrite(filename);
        printWriter.println("Software|"+software.getId()+"|"+software.getiName()+"|"+software.getPrice()+"|"
                +software.getiQtt()+"|"+software.getNoCd());
        closeFileToWrite(filename);
    }

    public void updateItemsFromFile(ArrayList<ShopItem> shopItems, String filename ) throws IOException{
        fileWriter = new FileWriter(filename, false);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
        for(var x: shopItems){
            if(x instanceof Book){
                printWriter.println("Book|"+ ((Book) x).getId()+"|"+((Book) x).getiName()+"|"+((Book) x).getPrice()+
                        "|"+((Book) x).getiQtt()+"|"+ ((Book) x).getWeight());
            }else if(x instanceof Software){
                printWriter.println("Software|" + ((Software) x).getId()+"|"+((Software) x).getiName()+"|"+((Software) x).getPrice()+
                        "|"+((Software) x).getiQtt()+"|"+ ((Software) x).getNoCd());
            }
        }
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public ArrayList<ShopItem> readShopItemFromFile(String filename) throws IOException{
        openFileToRead(filename);
        ArrayList<ShopItem> shopItems = new ArrayList<>();
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            ShopItem shopItem = createDataFromFile(data);
            shopItems.add(shopItem);
        }
        closeFileToRead(filename);
        return shopItems;
    }

    public ShopItem createDataFromFile(String data){
        String[] datas = data.split("[|]");
        if(datas[0].equalsIgnoreCase("BOOK")){
            Book book = new Book(datas[1], datas[2], Double.parseDouble(datas[3]), Integer.parseInt(datas[4]), Double.parseDouble(datas[5]));
            return book;
        }else {
            Software software = new Software(datas[1], datas[2], Double.parseDouble(datas[3]), Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));
            return software;
        }

    }


    public void updateItemsInTheInvoice(ArrayList<ShopItem> shopItems, String filename) throws IOException{
        fileWriter = new FileWriter(filename, false);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
        for(var x: shopItems){
            if(x instanceof Book){
                printWriter.println("Book: ");
                printWriter.println(((Book) x).getId()+"|"+((Book) x).getiName()+"|"+((Book) x).getPrice()+
                        "|"+((Book) x).getiQtt()+"|"+ ((Book) x).getWeight());
            }else if(x instanceof Software){
                printWriter.println("Software: ");
                printWriter.println(((Software) x).getId()+"|"+((Software) x).getiName()+"|"+((Software) x).getPrice()+
                        "|"+((Software) x).getiQtt()+"|"+ ((Software) x).getNoCd());
            }
        }


        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public void updateItemsInTheInvoice(Basket basket ,ArrayList<ShopItem> shopItems, String filename, String nameCus) throws IOException{
        fileWriter = new FileWriter(filename, false);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
        printWriter.println("Customer name : " + nameCus);
        for(var x: shopItems){
            if(x instanceof Book){
                printWriter.println(((Book) x).getId()+"|"+((Book) x).getiName()+"|"+((Book) x).getPrice()+
                        "|"+((Book) x).getiQtt()+"|"+ ((Book) x).getWeight());
            }else if(x instanceof Software){
                printWriter.println(((Software) x).getId()+"|"+((Software) x).getiName()+"|"+((Software) x).getPrice()+
                        "|"+((Software) x).getiQtt()+"|"+ ((Software) x).getNoCd());
            }
        }

        printWriter.println("Total price: "+ basket.getTotal());
        double total =  basket.getTotal()+basket.transFeeTotal();
        double tranFer = total - basket.getTotal();
        printWriter.println("Total fee bonus: "+ tranFer);
        printWriter.println("Total amount price: " +total);

        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }
}
