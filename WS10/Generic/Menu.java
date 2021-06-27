/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semeter2_OOP_With_Jav_a.WS10.Generic;

/**
 *
 * @author 84337
 */
public class Menu {
    public int menu(){
        int choice;
        System.out.println("1 for Add");
        System.out.println("2 for display");
        System.out.println("3 for get size");
        System.out.println("4 for check Empty");
        System.out.println("5 for delete");
        System.out.println("6 for exit");
        choice=Validation.checkInputIntLimit(1, 6);
        return choice;
    }
    public int menuFl(){
        int choice;
        System.out.println("1.Add");
        System.out.println("2.Display");
        System.out.println("3.sort");
        System.out.println("4.search");
        System.out.println("5.delete");
        System.out.println("6.exit");
        choice=Validation.checkInputIntLimit(1, 6);
        return choice;
    }
    public int M(){
            System.out.println("1. Car");
            System.out.println("2.Flower");
             int ch=Validation.checkInputIntLimit(1,3);
             return ch;
}
}
