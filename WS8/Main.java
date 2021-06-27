package Semeter2_OOP_With_Jav_a.WS8;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Controler controler = new Controler();
        int choice;
        do{
            choice = menu.mainmenu();
            switch (choice){
                case 1:{
                    System.out.println("Sum is: "+ controler.add());
                    break;
                }
                case 2:{
                    System.out.println("Sub is: " + controler.sub());
                    break;
                }
                case 3:{
                    System.out.println("Multi is: " +  controler.multi());
                    break;
                }
                case 4:{
                    System.out.println("Dev: " +controler.devide());
                    break;
                }
            }
        }while (choice!=5);
    }
}
