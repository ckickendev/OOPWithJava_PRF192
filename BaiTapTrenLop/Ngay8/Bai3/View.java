package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

public class View {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        VectorChua vectorChua = new VectorChua();
        int choice;
        do {
            choice = menu.menuChoice();
            switch (choice){
                case 1:{
                    vectorChua.add();
                    break;
                }
                case 2:{
                    vectorChua.remove();
                    break;
                }
                case 3:{
                    vectorChua.readFromFile();
                    break;
                }
            }
        }while (choice!=5);
    }
}
