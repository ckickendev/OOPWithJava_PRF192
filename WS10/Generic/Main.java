  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semeter2_OOP_With_Jav_a.WS10.Generic;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Menu m = new Menu();
        generic<Car> listCar = new generic<>();
        generic<Flower> listFlower = new generic<>();
        Car c = new Car();
        Flower fl = new Flower();
        int ch = m.M();
        all:
        while (ch != 3) {
            switch (ch) {
                case 1: {
                    int choice = m.menu();
                    while (choice != 6) {

                        switch (choice) {
                            case 1:
                                listCar.list.add(c.Enter());
                                break;
                            case 2:
                                listCar.display();
                                break;
                            case 3:
                                listCar.getSize();
                                break;
                            case 4:
                                listCar.checkEmpty();
                                break;
                            case 5:
                                listCar.remove();
                                break;
                            case 6:
                                continue all;
                            default:
                                throw new AssertionError();
                        }
                        choice = m.menu();
                    }
                    break;
                }

       
                case 2: {
                    int choi = m.menuFl();
                    while (choi != 6) {

                        switch (choi) {
                            case 1:
                                listFlower.list.add(fl.Enter());
                                break;
                            case 2:
                                listFlower.display();
                                break;
                            case 3:
                                listFlower.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
                                break;
                            case 4:
                                listFlower.search(fl.Enter());
                                break;
                            case 5:
                                listFlower.remove();
                                break;
                            case 6:
                                continue all;
                            default:
                                throw new AssertionError();
                        }
                        choi = m.menuFl();

                    }
                    break;
                }
            }
            ch = m.M();
        }
    }

}
