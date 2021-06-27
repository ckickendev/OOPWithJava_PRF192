package Semeter2_OOP_With_Jav_a.WS5.Part2.ShopDrinkManagement;

public class BuilderDemo {
    public static void main(String[] args) {
        OrderBuilder builder=new OrderBuilder();
        OrderedItems orderedItems=builder.preparePizza();
        orderedItems.showItems();
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
    }
}
