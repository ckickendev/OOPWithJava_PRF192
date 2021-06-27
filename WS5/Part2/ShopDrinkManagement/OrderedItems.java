package Semeter2_OOP_With_Jav_a.WS5.Part2.ShopDrinkManagement;

public class OrderedItems {
    Items[] items = new Items[30];
    int count = 0;
    public void addItems(Items item){
        items[count] = item;
        count++;
    }
    public float getCost(){
        float cost = 0.0f;
        for(int i=0; i<count ;i++){
            cost += items[i].price();
        }
        return cost;
    }

    public void showItems() {
        System.out.println("Info all items");
        for(int i = 0; i<count; i++){
            System.out.println("Item is:" + items[i].name());
            System.out.println("Size is:" + items[i].size());
            System.out.println("Price is: " + items[i].price());
            System.out.println("--------------");
        }
    }

}
