package Semeter2_OOP_With_Jav_a.WS4.Part2.StudentManagement;


public class Menu {
    public static int index=0;
    public static void main(String[] args) {
        StudentManagementScreen.displayMenu();
        int choice;
        Student[] students = new Student[100];
        do{
            System.out.println("Please type your choice: ");
        choice = Check.checkInputLimit(1,3);
        switch (choice){
                case 1:{
                    StudentManagementScreen.createrStudent(students);
                    break;
                }
                case 2:{
                    StudentManagementScreen.displayStudent(students);
                    break;
                }
                case 3:{
                    break;
                }
            }
        }while (choice!=3);
    }
}
