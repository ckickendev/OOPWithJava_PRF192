package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai4;

import java.util.LinkedList;

public class GenericCar<T> {
    private LinkedList<T> items = new LinkedList<T>();
    private T t;

    public LinkedList<T> getItems() {
        return items;
    }

    public void setItems(LinkedList<T> items) {
        this.items = items;
    }

    public Car createCar(){
        Validation validation = new Validation();
        System.out.print("Enter name: "); String name = validation.checkInputString();
        System.out.print("Enter price: ");double price = validation.checkInputDouble();
        System.out.print("Enter production");String pro = validation.checkInputString();
        Car car = new Car(name, price, pro);
        return car;
    }

    public GenericCar() {
    }

    public GenericCar(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void add(T item){
        items.addFirst(item);
        System.out.println("");
        System.out.println("List after add: ");
        display();
    }

    public void display(){
        for (T item : items) {
            System.out.println(item+" ");
        }
    }

    public int size(){
        return items.size();
    }

    public boolean checkEmpty(){
        return items.isEmpty();
    }

    Validation validation = new Validation();

    public void delete(int pos){
        items.remove(pos);
        display();
        System.out.println("After remove: ");
        display();
    }

}
