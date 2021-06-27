package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.StudentDemo;

public class StudentDemo {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Student.uni = "FPT DN Uni";
            Student student01 = new Student(111, "Mr A");
            Student student02 = new Student(222, "Mr D");
            System.out.println(""+student01);
            System.out.println(""+student02);
        }
}
