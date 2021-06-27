package Semeter2_OOP_With_Jav_a.Assignment;

public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        PatientList patientList = new PatientList();

        int choice;
        do {
            choice = menu.menuChoice();
            switch (choice){
                case 1:{
                    patientList.addPatient();
                    break;
                }
                case 2:{
                    System.out.println("Fee average is: " + patientList.FeeAverageInPatient());
                    break;
                }
                case 3:{
                    patientList.ListOutPatient();
                    break;
                }
                case 4:{
                    System.out.println("Date min: "+ patientList.lastMinHospitalFee());
                    break;
                }
                case 5:{
                    patientList.removeInPant();
                    break;
                }
            }
        }while (choice!=6);
    }
}
