package Semeter2_OOP_With_Jav_a.WS10.Doctor10;

public class Main {

    public static void main(String[] args) {
        DoctorList doctorList = new DoctorList();

        for (;;) {
            int choice = Menu.get();

            switch (choice) {
            case 1:
                doctorList.add();
                break;
            case 2:
                doctorList.update();
                break;
            case 3:
                doctorList.remove();
                break;
            case 4:
                doctorList.search();
                break;
            case 5:
                return;
            }
        }
    }
}
