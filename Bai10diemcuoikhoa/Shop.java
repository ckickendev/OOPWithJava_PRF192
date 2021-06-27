package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    private Store store = new Store();
    private Basket basket = new Basket();
    public FileController fileController = new FileController();
    File file = new File("INVOICE.DAT");
    private String invoiceFile = "INVOICE.DAT";


    Validation validation = new Validation();

    public Shop() throws IOException {
        fileController.updateItemsInTheInvoice(basket, basket.getSelectedItems(), invoiceFile, getBasket().getNameCus());
    }

    public Shop(Store store) throws IOException {
        this.store = store;
    }

    public Store getStore(){
        return store;
    }

    public void setSt(Store store) {
        this.store = store;
    }

    public void Shopping() throws IOException {
        fileController.updateItemsInTheInvoice(basket, basket.getSelectedItems(), invoiceFile, getBasket().getNameCus());
        if(Basket.count > 0){
            basket.display();
        }
        if(store.getShopItems().isEmpty()){
            System.out.println("Do not have any items");
            return;
        }

        if (basket.getNameCus() != null) {
            System.out.println("");
            System.out.println("Welcome " + basket.getNameCus() +" !!!");
            fileController.updateItemsInTheInvoice(basket, basket.getSelectedItems(), invoiceFile, getBasket().getNameCus());
        } else {
            System.out.println("Shopping, Enter your name");
            String name = validation.checkInputString();
            basket.setNameCus(name);
            fileController.updateItemsInTheInvoice(basket, basket.getSelectedItems(), invoiceFile, getBasket().getNameCus());
        }

        while (true){
            if (basket.getSelectedItems().isEmpty()){
                System.out.println("No one in your cart");
            }else {
                basket.display();
            }
            System.out.print("Enter id you want to buy: ");String idBuy = validation.checkInputString();
            int index = validation.checkIdExit(store.getShopItems(), idBuy);

            if(index==-1){
                break;
            }
            else {
                System.out.print("Enter number of items you want to buy: "); int numberBuy = validation.checkInputInt();
                if(numberBuy > store.getShopItems().get(index).getiQtt()){
                    System.out.println("Cannot load because items is not enough , please check again");
                }
                else {
                    if (validation.checkIdExit(basket.getSelectedItems(), idBuy) != -1) {
                        int indexOfSameId = validation.checkIdExit(basket.getSelectedItems(), idBuy);
                        basket.getSelectedItems().get(indexOfSameId).setiQtt(basket.getSelectedItems().get(indexOfSameId).getiQtt() +
                                numberBuy);
                        fileController.updateItemsInTheInvoice(basket, basket.getSelectedItems(),invoiceFile, basket.getNameCus());
                        break;
                    } else {
                        basket.addItems(store.getShopItems().get(index), numberBuy);
                        int newQtt = store.getShopItems().get(index).getiQtt() - numberBuy;
                        store.getShopItems().get(index).setiQtt(newQtt);
                        if (store.getShopItems().get(index).getiQtt() == 0) {
                            store.getShopItems().remove(index);
                        }

                        if (store.getShopItems().get(index) instanceof Book) {
                            fileController.writeBookToFile((Book) basket.getSelectedItems().get(Basket.count - 1), invoiceFile);
                        } else {
                            fileController.writeSoftwareToFile((Software) basket.getSelectedItems().get(Basket.count - 1), invoiceFile);
                        }
                        break;
                    }
                }
            }
        }
    }


    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public ArrayList<ShopItem> getCartSelectedItems() {
        return basket.getSelectedItems();
    }

    public String getInvoiceFile() {
        return invoiceFile;
    }

    public void setInvoiceFile(String invoiceFile) {
        this.invoiceFile = invoiceFile;
    }

    public FileController getFileController() {
        return fileController;
    }

    public void setFileController(FileController fileController) {
        this.fileController = fileController;
    }

}
