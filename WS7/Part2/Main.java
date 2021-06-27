package Semeter2_OOP_With_Jav_a.WS7.Part2;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Menu menu = new Menu();
        int choice;
        do{
            choice = menu.callMenu();
            switch (choice){
                case 1:{
                    studentList.createStudent();
                    break;
                }
                case 2:{
                    studentList.findAndSort();
                    break;
                }
                case 3:{
                    studentList.updateOrDelete();
                    break;
                }
                case 4:{
                    studentList.report();
                    break;
                }
            }
        }while (choice!=5);
    }
}
