package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        Store store = new Store();
        Shop shop = new Shop(store);


        while (true){
            int choice = manager.Menu();
            if(choice == 1){
                boolean dk = true;
                while (dk){
                    store.displayListItems();
                    int choiceA = manager.menuForAdmin();
                    switch (choiceA){
                        case 1:{
                            System.out.println("Add Items ");
                            store.addItems();
                            break;
                        }
                        case 2:{
                            System.out.println("Update Items ");
                            store.updateItems();
                            break;
                        }
                        case 3:{
                            System.out.println("View Items");
                            store.displayListItems();
                            break;
                        }
                        case 4:{
                            System.out.println("Remove Items");
                            store.removeItem();
                            break;
                        }
                        case 5:{
                            System.out.println("Read shop items from file");
                            store.readFromFile();
                            break;
                        }
                        case 6:{
                            System.out.println("Exit");
                            dk = false;
                        }
                    }
                }
            }
            else if(choice == 2){

                boolean dk = true;
                while (dk){
                    store.displayListItems();
                    shop.getBasket().display();
                    int choiceB = manager.menuCustomer();
                    switch (choiceB){
                        case 1: {
                            System.out.println("Add to Shopping Basket");
                            shop.Shopping();
                            break;
                        }
                        case 2: {
                            System.out.println("Display the Shopping basket");
                            shop.getBasket().display();
                            break;
                        }
                        case 3: {
                            System.out.println("Remove Shopping Basket");
                            shop.getBasket().removeBasket();
                            shop.getFileController().updateItemsInTheInvoice(shop.getBasket(), shop.getCartSelectedItems(),
                                    shop.getInvoiceFile(), shop.getBasket().getNameCus());
                            break;
                        }
                        case 4: {
                            System.out.println("Print Invoice(Orders)");
                            shop.getBasket().printInvoice();
                            break;
                        }
                        case 5: {
                            System.out.println("Exit");
                            dk = false;
                        }
                    }
                }
            }
            if(choice==3){
                return;
            }
        }
    }
}
