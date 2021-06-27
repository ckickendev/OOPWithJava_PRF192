package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai4;

public class Main {
    public static void main(String[] args) {
        GenericCar genericCar = new GenericCar();
        GenericFlower genericFlower = new GenericFlower();
        Menu menu = new Menu();
        Validation validation = new Validation();
        int choice;
        do{
            choice = menu.menuALl();
            switch (choice){
                case 1:{
                    int choice1;
                    do {
                        choice1 = menu.menuCar();
                        switch (choice1){
                            case 1:{
                                genericCar.add(genericCar.createCar());
                                break;
                            }
                            case 2:{
                                genericCar.display();
                                break;
                            }
                            case 3:{
                                System.out.println("Size is: " + genericCar.size());
                                break;
                            }
                            case 4:{
                                System.out.println(genericCar.checkEmpty());
                                break;
                            }
                            case 5:{
                                System.out.println("Please enter index: ");
                                int x = validation.checkInputInt();
                                genericCar.delete(x);
                                break;
                            }
                        }
                    }while (choice1!=6);
                    break;
                }
                case 2:{
                    int choice2;
                    do {
                        choice2 = menu.menuFlower();
                        switch (choice2){
                            case 1:{
                                genericFlower.add(genericFlower.createFlower());
                                break;
                            }
                            case 2:{
                                genericFlower.display();
                                break;
                            }
                            case 3:{
                                genericFlower.sort();
                                break;
                            }
                            case 4:{
                                Flower flowersearch = genericFlower.createFlower();
                                genericFlower.search(flowersearch);
                                break;
                            }
                            case 5:{
                                System.out.println("Enter index to delete: ");
                                int x = validation.checkInputInt();
                                genericFlower.delete(x);
                                break;
                            }
                        }
                    }while (choice2!=6);
                    break;
                }
            }
        }while (choice!=3);

    }
}
