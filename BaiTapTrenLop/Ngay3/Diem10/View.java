package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.Diem10;

public class View {
    public static void main(String[] args) {
        int select;
        StudentList studentList = new StudentList();
        Menu menu = new Menu();
        do{
            select = menu.select();
            switch (select){
                case 1:{
                    studentList.creat();
                    break;
                }
                case 2:{
                    studentList.display();
                    break;
                }
            }
        }while (select!=3);
    }
}
