package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai4;


import java.util.ArrayList;

public class GenericFlower<T> {
    private ArrayList<Flower> flowerArrayList = new ArrayList<>();

    public GenericFlower() {
    }

    public GenericFlower(ArrayList<Flower> flowerArrayList) {
        this.flowerArrayList = flowerArrayList;
    }

    public Flower createFlower(){
        Validation validation = new Validation();
        System.out.print("Enter name: "); String name = validation.checkInputString();
        System.out.print("Enter price: ");double price = validation.checkInputDouble();
        System.out.print("Enter color: ");String color = validation.checkInputString();
        Flower flower = new Flower(name, price, color);
        return flower;
    }

    public void add(Flower flower){
        flowerArrayList.add(flower);
        System.out.println("After add: ");
        display();
    }

    public void display(){
        for(var x: flowerArrayList){
            System.out.println(x);
        }
    }

    public void sort(){
        for(int i=0; i<flowerArrayList.size(); i++){
            for (int j=i+1; j<flowerArrayList.size(); j++){
                if(flowerArrayList.get(i).getPrice() < flowerArrayList.get(j).getPrice()){
                    Flower flower = flowerArrayList.get(i);
                    flowerArrayList.set(i, flowerArrayList.get(j));
                    flowerArrayList.set(j, flower);
                }
            }
        }
        System.out.println("");
        System.out.println("After sort: ");
        display();
    }

    public boolean search(Flower f){
        for(var x :flowerArrayList ){
            if(x == f){
                System.out.println("Find out");
                return true;
            }
        }
        System.out.println("Not find out");
        return false;
    }

    public void delete(int pos){
        flowerArrayList.remove(pos);
        System.out.println("After delete: ");
        display();
    }

    public ArrayList<Flower> getFlowerArrayList() {
        return flowerArrayList;
    }

    public void setFlowerArrayList(ArrayList<Flower> flowerArrayList) {
        this.flowerArrayList = flowerArrayList;
    }
}
