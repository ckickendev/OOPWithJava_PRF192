package Semeter2_OOP_With_Jav_a.Assignment;

import java.util.ArrayList;
import java.util.Date;

public class PatientList {
    ArrayList<Patient> patients;
    Validation validation = new Validation();

    public PatientList() {
        patients = new ArrayList<>();
    }

    public void addPatient(){
        System.out.println("Please choice Out-Patient(1) or In-Patient(2) ");
        int choice = validation.checkInputIntLimit(1,2);
        switch (choice){
            case 1:{
                System.out.println("Add Out-Patient: ");
                String code;
                int check = 1;
                do{
                    System.out.print("Please input code: ");code = validation.checkInputString();
                    if (validation.checkIdExit(patients, code)!=-1){
                        System.out.print("Cannot input because id is exist, input again");
                    }else {
                        check = 0;
                    }
                }while(check == 1 );
                System.out.print("Please input full name: ");String fullname = validation.checkInputString();
                System.out.print("Please input hospitalized date: ");Date date = validation.checkInputDate();
                System.out.print("Please input gender: ");String gender = validation.checkInputGender();
                System.out.print("Please input medicine cost: ");double meCost = validation.checkInputDouble();
                System.out.print("Please input examination fee: ");double examCost = validation.checkInputDouble();
                System.out.print("Please input testing fee: ");double testFee = validation.checkInputDouble();
                OutPatient outPatient = new OutPatient(code, fullname, date, gender, meCost, examCost, testFee);
                patients.add(outPatient);
                System.out.println("Add success !!!");
                break;
            }
            case 2:{
                System.out.println("Add In-Patient: ");
                String code;
                int check = 1;
                do{
                    System.out.print("Please input code: ");code = validation.checkInputString();
                    if (validation.checkIdExit(patients, code)!=-1){
                        System.out.print("Cannot input because id is exist, input again");
                    }else {
                        check = 0;
                    }
                }while(check == 1 );
                System.out.print("Please input full name: ");String fullname = validation.checkInputString();
                System.out.print("Please input hospitalized date: ");Date date = validation.checkInputDate();
                System.out.print("Please input gender: ");String gender = validation.checkInputGender();
                System.out.print("Please input medicine cost: ");double meCost = validation.checkInputDouble();
                System.out.print("Please input daily fee: ");double dailyFee = validation.checkInputDouble();
                System.out.print("Please input discharge date: ");Date date1 = validation.checkInputDate();
                InPatient inPatient = new InPatient(code, fullname, date, gender, meCost, dailyFee,date1);
                patients.add(inPatient);
                System.out.println("Add success !!!");
                break;
            }
        }
    }

    public double FeeAverageInPatient(){
        long sum = 0,count = 0;
        for( var x: patients){
            if(x instanceof InPatient){
                sum += x.ComputerFee();
                count++;
            }
        }
        if(count==0){
            return 0;
        }else {
            return sum/count;
        }
    }

    public void ListOutPatient(){
        System.out.println("List of out-patient: ");
        for (var x: patients){
            if(x instanceof OutPatient){
                System.out.print(x);
                System.out.println(" Hospital fee: "+ x.ComputerFee());
            }
        }
    }

    public Date lastMinHospitalFee() {
        double min = patients.get(0).ComputerFee();
        int index = 0;
        for (int i = 1; i < patients.size(); i++) {
            if (patients.get(i).ComputerFee() <= min) {
                index = i;
            }
        }
        if (patients.get(index) instanceof OutPatient){
            return patients.get(index).getHospitalizedDate();
        }else if(patients.get(index) instanceof InPatient){
            return ((InPatient) patients.get(index)).getDischargedDate();
        }else {
            System.out.println("Not found");
            return null;
        }
    }

    public void removeInPant(){
        System.out.print("Input date you want to check: ");Date date = validation.checkInputDate();
        for(var x: patients){
            if(x instanceof InPatient){
                if (((InPatient) x).getDischargedDate().getTime() >= date.getTime()){
                    patients.remove(x);
                }
            }
        }
        System.out.println("After remove: ");
        displayAll();
    }

    public void displayAll(){
        System.out.println("List of patient: ");
        for(var x: patients){
            System.out.println(x);
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
