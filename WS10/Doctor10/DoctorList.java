package Semeter2_OOP_With_Jav_a.WS10.Doctor10;

import java.util.ArrayList;

public class DoctorList {

    private ArrayList<Doctor> listD = new ArrayList<Doctor>();

    public DoctorList() {
    }

    public void add() {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        int pos = Validation.checkIdExist(listD, code);
        while (pos != -1) {
            System.out.println("Exist! Enter again");
            code = Validation.checkInputString();
            pos = Validation.checkIdExist(listD, code);
        }
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();

        System.out.print("Enter specialization: ");
        String specialization = Validation.checkInputString();

        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();

        listD.add(new Doctor(code, name, specialization, availability));

        System.out.println("Add successfully");
    }

    public void update() {
        if (listD.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Enter code: ");

        String code = Validation.checkInputString();
        int pos = Validation.checkIdExist(listD, code);
        while (pos == -1) {
            System.out.println("Not Exist! Enter again");
            code = Validation.checkInputString();
            pos = Validation.checkIdExist(listD, code);
        }
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();

        System.out.print("Enter specialization: ");
        String specialization = Validation.checkInputString();

        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();
        listD.get(pos).setName(name);
        listD.get(pos).setAvailability(availability);
        listD.get(pos).setSpecialization(specialization);
       

        System.out.println("Update successfully");
    }

    public void search() {
        if (listD.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        int pos = Validation.checkIdExist(listD, code);
        if (pos == -1) {
            System.out.println("Not exist");
            return;
        } else {
            System.out.println("" + listD.get(pos));
        }

    }

    public void remove() {
        if (listD.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        int pos = Validation.checkIdExist(listD, code);
        if (pos == -1) {
            System.out.println("Don't have");
            return;
        } else {
            listD.remove(pos);
            System.out.println("Remove success!");
        }
    }
}
