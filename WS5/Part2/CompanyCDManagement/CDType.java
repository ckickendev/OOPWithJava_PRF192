package Semeter2_OOP_With_Jav_a.WS5.Part2.CompanyCDManagement;

public class CDType {
    private Packing[] items = new Packing[30];
    int count = 0;
    public void addItems(Packing pack){
        items[count] = pack;
        count+=1;
    }
    public void getCost(){
        int cost = 0;
        for (int i=0; i<count; i++){
            cost += items[i].price();
        }
        System.out.println("Your cost is: "+ cost);
    }

    public void showItems(){
        for (int i=0; i<count; i++){
            System.out.print("CD name : "+ items[i].pack());
            System.out.println(", price : "+ items[i].price());
        }
    }
}
