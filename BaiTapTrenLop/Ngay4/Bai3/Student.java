package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai3;

public class Student extends Person{
    private static int numCourse=0;
    String[] courses = new String[10];
    int[] grades = new int[10];

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade){
        courses[numCourse] = course;
        grades[numCourse] = grade;
        numCourse++;
    }

    public void printGrade(){
        System.out.println("Name: " +super.name);
        for(int i=0; i<=numCourse; i++){
            System.out.println("Course: "+courses[i] +", Grade: " + grades[i]);
        }
    }

    public double getArerage(){
        int sum=0;
        for (int i=0; i<=numCourse; i++){
            sum+= grades[i];
        }
        return sum/numCourse*1.0;
    }

    @Override
    public String toString() {
        return "Student{" +name+"("+address+")";
    }
}
