package Semeter2_OOP_With_Jav_a.WS7.Part2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    ArrayList<Student> students = new ArrayList<>();
    Validation validation = new Validation();

    public StudentList() {
        students.add(new Student("1","DucDo","3", "C/C++"));
        students.add(new Student("1","TrungDung","3", "C/C++"));
    }

    public void createStudent(){
        while (true) {
            System.out.print("Enter id: ");
            String id = validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = validation.checkInputString();
            if (validation.checkIdExist(students, id) != -1) {
                System.err.println("Id has exist student. Pleas re-input.");
                if (!validation.checkInputYesNo()) {
                    return;
                }
            }
            System.out.print("Enter semester: ");
            String semester = validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = validation.checkInputCourse();

            students.add(new Student(id, name, semester, course));
            System.out.println("Add student success.");
            System.out.print("Do you want to continue : y/n: ");
            if (!validation.checkInputYesNo()) {
                return;
            }
        }
    }

    public void findAndSort() {
        if (students.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.print("Enter name to search: ");
        String name = validation.checkInputString();

        for (Student student : students) {
            if (student.getStudentName().contains(name)) {
                listStudentFindByName.add(student);
                }
            }
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not exist.");
            } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            for (Student student : listStudentFindByName) {
                student.print();
            }
        }
    }

    public void updateOrDelete() {
        if (students.isEmpty()) {
            System.err.println("List empty.");
            return;
            }
        System.out.print("Enter id to update/delete: ");
        String id = validation.checkInputString();
        int index = validation.checkIdExist(students, id);
        if (index == -1) {
            System.err.println("Not found student.");
            return;
            } else {
            System.out.print("Do you want to update (U) or delete (D) student: ");
            if (validation.checkInputUD() == 'U') {
                System.out.print("Enter name student: ");
                String name = validation.checkInputString();
                System.out.print("Enter semester: ");
                String semester = validation.checkInputString();
                System.out.print("Enter name course: ");
                String course = validation.checkInputCourse();
                students.get(index).setStudentName(name);
                students.get(index).setSemester(semester);
                students.get(index).setCourseName(course);
                System.err.println("Update success.");
                return;
                } else {
                students.remove(index);
                System.err.println("Delete success.");
                return;
            }
        }
    }

    public void report() {
        Collections.sort(students);
        for (Student l : students) {
            System.out.println(l);
            }
        }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> ls) {
        this.students = ls;
    }
}
