package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    ArrayList<ShopItem> selectedItems = new ArrayList<ShopItem>();
    Validation validation = new Validation();
    private String nameCus;
    public static int count = 0;


    public Basket() {
    }

    public Basket(ArrayList<ShopItem> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public double getTotal(){
        double total = 0;
        for (var x: selectedItems){
            total += x.getPrice()*x.getiQtt();
        }
        return total;
    }

    double tft = 0, totalWeightBook = 0, totalCd = 0;

    public double transFeeTotal(){

        for (var x: selectedItems){
            if(x instanceof Book){
                totalWeightBook+= ((Book) x).getWeight()*x.getiQtt();
            }else{
                totalCd += ((Software) x).getNoCd()*x.getiQtt();
            }
        }
        if (totalWeightBook == 0){
            tft+=0;
        }else if(totalWeightBook<0.5 && totalWeightBook>0){
            tft+=5.00;
        }else if(totalWeightBook<1){
            tft+=9.5;
        }else {
            tft+= 9.5 + 7.00*(Math.floor(totalWeightBook)-1);
        }

        if(totalCd==0){
            tft+=0;
        }else if(totalCd<=3 && totalWeightBook>0){
            tft+= 3.25*totalCd;
        }else {
            tft+= 3.25*totalCd + 1.25*(totalCd-3);
        }


        return tft;
    }

    public void printInvoice(){
        Collections.sort(selectedItems);
        System.out.println("");
        System.out.println("You have "+selectedItems.size()+ " items :" );
        for(var x: selectedItems){
            System.out.println(x);
        }
        System.out.println("Total weight of book: "+ totalWeightBook);
        System.out.println("Total cdroms: "+ totalCd);
        System.out.println("Your total price: " + getTotal());
        System.out.println("Your total transfer fee: " + transFeeTotal());
    }

    public void display(){
        Collections.sort(selectedItems);
        if(!selectedItems.isEmpty()){
            System.out.println("Every thing you have in your cart: ");
        } else{
            System.out.println("Nothing in your cart");
        }
        for (var x: selectedItems){
            int y = selectedItems.indexOf(x)+1;
            System.out.print(y+"- ");
            System.out.println(x);
        }
        System.out.println("");
    }

    public void addItems(ShopItem item, int qtt){
        if(item instanceof Book){
            Book newItem = new Book();
            newItem.setId(item.getId());
            newItem.setiQtt(qtt);
            newItem.setiName(item.getiName());
            newItem.setPrice(item.getPrice());
            newItem.setWeight(((Book) item).getWeight());
            selectedItems.add(newItem);
            count++;
        }
        if(item instanceof Software){
            Software newItem = new Software();
            newItem.setId(item.getId());
            newItem.setiQtt(qtt);
            newItem.setiName(item.getiName());
            newItem.setPrice(item.getPrice());
            newItem.setNoCd(((Software) item).getNoCd());
            selectedItems.add(newItem);
            count++;
        }
        Collections.sort(selectedItems);
    }

    public static int idValid;

    public void removeBasket(){
        Collections.sort(selectedItems);
        if (selectedItems.isEmpty()){
            System.out.println("Basket is empty");
            return;
        }
        while (true){
            System.out.println("Enter the id to remove");
            String id = validation.checkInputString();
            idValid = validation.checkIdExit(selectedItems,id);
            if(idValid == -1){
                break;
            }
            selectedItems.remove(idValid);
            count--;
            return;
        }
    }

    public ArrayList<ShopItem> getSelectedItems(){
        return selectedItems;
    }

    public void setSelectedItems(ArrayList<ShopItem> selectedItems){
        this.selectedItems = selectedItems;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }
}
