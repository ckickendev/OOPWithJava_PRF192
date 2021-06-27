package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.BaiKT06;

public class View {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Validation validation = new Validation();
        Menu menu = new Menu();
        int choice;
        do{
            choice = menu.MenuChoice();
            switch (choice){
                case 1:{
                    System.out.println("Enter the size of list: ");
                    int size = Integer.parseInt(validation.checkInputString());
                    contactList = new ContactList(size);
                    contactList.enterArray();
                    break;
                }
                case 2:{
                    System.out.println("Display list contact");
                    contactList.display();
                    break;
                }
                case 3:{
                    contactList.update();
                    break;
                }
                case 4:{
                    contactList.delete();
                    System.out.println("Display list contact after delete");
                    contactList.display();
                    break;
                }
            }
        }while (choice !=5);
    }
}
