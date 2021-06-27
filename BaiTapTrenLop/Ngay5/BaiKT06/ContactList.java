package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay5.BaiKT06;

import java.util.Scanner;

public class ContactList {
    static Scanner scanner = new Scanner(System.in);
    Contact[] contacts;
    int size;
    public ContactList() {
    }

    public ContactList(int size) {
        this.contacts = new Contact[size];
        this.size = size;
    }

    public void enterArray() {
        for (int i = 0; i < contacts.length; i++) {
            Validation validation = new Validation();
            System.out.println("========================");
            System.out.println("Enter contact " + i + ":");
            System.out.print("Enter id: ");
            String id = validation.checkID();
            System.out.print("Enter fullName: ");
            String fullName = validation.checkInputString();
            System.out.print("Enter address: ");
            String address = validation.checkInputString();
            System.out.print("Enter dob: ");
            String dobb = validation.checkDOB();
            System.out.print("Enter phone number: ");
            String phone = validation.checkPhoneNumber();
            System.out.print("Enter email: ");
            String email = validation.checkEmail();
            Contact cont = new Contact(id, fullName, address, dobb, phone, email);
            contacts[i] = cont;
        }
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("==============");
            System.out.println("" + contacts[i]);
        }
    }
    public int findID(String id) {
        for (int i = 0; i < size; i++) {
            if (id.equals(contacts[i].getId())) {
                return i;
            }
        }
        return -1;
    }
    public void update() {
        System.out.println("Enter ID: ");
        String ID = scanner.nextLine();
        int res = findID(ID);
        Validation validation = new Validation();
        if (res != -1) {
            System.out.print("Enter fullName: ");
            String fullName = validation.checkInputString();
            System.out.print("Enter address: ");
            String address = validation.checkInputString();
            System.out.print("Enter dob: ");
            String dateOB = validation.checkDOB();
            System.out.print("Enter phone number: ");
            String phone = validation.checkPhoneNumber();
            System.out.print("Enter email: ");
            String email = validation.checkEmail();
            Contact cont = new Contact(ID, fullName, address, dateOB, phone, email);
            contacts[res] = cont;
        }
    }
    public void delete() {
        System.out.println("Enter ID: ");
        String ID = scanner.nextLine();
        int res = findID(ID);
        if (res != -1) {
            for (int i = res; i < size - 1; i++) {
                contacts[i] = contacts[i + 1];
            }
            size--;
        }
    }
}
