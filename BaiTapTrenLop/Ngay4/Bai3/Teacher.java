    package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai3;

    public class Teacher extends Person{
        static int numCourse = 0;
        String[] courses = new String[10];

        public Teacher(String name, String address) {
            super(name, address);
        }

        public boolean addCourse(String course){
            for(int i=0; i<numCourse; i++){
                if(course.compareTo(courses[numCourse])==0){
                    System.out.println("Invalid exist");
                    return false;
                }
            }
            return true;
        }

        public boolean removeCourse(String course){
            for(int i=0; i<numCourse; i++){
                if (!(course.compareTo(courses[numCourse])==0)){
                    System.out.println("Invalid not found");
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return "Teacher:" + name+"("+address+")";

        }
    }
