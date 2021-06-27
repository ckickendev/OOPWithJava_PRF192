package Semeter2_OOP_With_Jav_a.WS4.Part2.StudentManagement;

public class StudentManagementScreen {

    public static void displayMenu(){
        System.out.println("Menu: ");
        System.out.println("1.Creat Student");
        System.out.println("2.Display Students");
        System.out.println("3.Exit");
    }
    public static void createrStudent(Student[] students){
        while(true){
            if(Menu.index>10){
                System.out.println("Do you want to continues");
                if(!Check.checkYesNo()){
                    return;
                }
            }

            System.out.println("---------------------------------------");
            System.out.println("Student " + Menu.index);
            System.out.println("Please input ID");
            String id = Check.checkString();
            System.out.println("Please input Student name");
            String name = Check.checkString();
            System.out.println("Please input Semeter name");
            int semester = Check.checkInterger();
            System.out.println("Please input course name");
            String cousrename = Check.checkCourseName();
            Student student = new Student(id, name, semester, cousrename);
            students[Menu.index] = student;
            Menu.index+=1;

        }
    }


    public static void displayStudent(Student[] students){
        for (int i=0 ; i<=Menu.index ;i++){
            System.out.println(students[i]);
        }
    }
}
