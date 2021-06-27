package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.StudentDemo;

public class Student {
        private int id;
        private String name;
        public static String uni="FPT Uni";

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUni() {
            return uni;
        }

        public void setUni(String uni) {
            this.uni = uni;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + ", uni=" + uni + '}';
        }



}
