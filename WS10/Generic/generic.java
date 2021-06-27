/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semeter2_OOP_With_Jav_a.WS10.Generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author 84337
 */
public class generic <T> {
    private T item;
    ArrayList<T> list= new ArrayList<>();
    public generic() {
    }

    public generic(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
       public void getSize(){
            System.out.println("Size :"+list.size());
}
      public void checkEmpty(){
          if(list.size()==0){
              System.out.println("Empty");
          } else 
              System.out.println("Not empty");
      }
      public void remove(){
          System.out.println("Enter position want to remove");
          int pos=Validation.checkInputIntLimit(1,list.size());
          list.remove(pos-1);
      }
      public void display(){
          for (T t : list) {
              System.out.println(""+t);
          }
      }
            
    public void sort(Comparator<? super T> c){
        list.sort(c);
    }
    public void search(Flower t){
    if (list.contains(t)){
        System.out.println("Have");
    } else {
        System.out.println("Don't Have");
    }
    }


    public static class Flower extends Semeter2_OOP_With_Jav_a.WS10.Generic.Flower {
        public Flower(String name, double price, String color) {
        }
    }
}
