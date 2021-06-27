package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai4;

public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ProductManagement productManagement = new ProductManagement();

        int choice;

        do{
            choice=menu.menuu();
            switch (choice){
                case 1: {
                    productManagement.addProduct();
                    break;
                }
                case 2:{
                    productManagement.displayAll();
                    break;
                }
            }
        }while(choice>0 && choice <3);
    }
}
