package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.Bai2;

public class PhoneDemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        PhoneList phoneList = new PhoneList();
        int select;
        do{
            menu.showMenu();
            System.out.println("Choose select");
            select = Integer.parseInt(PhoneList.scanner.nextLine());
            if(select==1){
                phoneList.enterPhone();
            }
            else if (select==2){
                phoneList.displayPhone();
            }
        }while (select!=0);
    }
}
