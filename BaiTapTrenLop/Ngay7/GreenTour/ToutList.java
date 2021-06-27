package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.GreenTour;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ToutList {
    Validation validation = new Validation();
    ArrayList<Tour> Tours;
    Scanner scanner = new Scanner(System.in);

    public ToutList() {
        this.Tours = new ArrayList<>();
    }

    public int isExist(String code){
        for(var x: Tours){
            if (x.getCode()==code){
                return Tours.indexOf(x);
            }
        }
        return -1;
    }

    public void addTour(){
        System.out.println("Please choose Dosmetic(1) and Inter(2) ");
        int type = validation.checkInputInt();
        if(type == 1){
            System.out.println("Enter Tip");double tip = validation.checkInputLong();
            System.out.println("Enter code");String code = validation.checkInputCode();
            System.out.println("Enter title");String title = validation.checkInputString();
            System.out.println("Enter price");double price = validation.checkInputLong();
            System.out.println("Enter transport");String transport = validation.checkInputTransport();
            System.out.println("Enter day begin");
            Date datebegin = validation.checkInputDate();
            Date dateend = validation.checkInputDate();
            DomesticTour domesticTour = new DomesticTour(code,title,price,transport,datebegin,dateend, tip);
            Tours.add(domesticTour);
        }else if( type ==2 ){
            System.out.println("Enter superchar");double superchar = validation.checkInputLong();
            System.out.println("Enter code");String code = validation.checkInputCode();
            System.out.println("Enter title");String title = validation.checkInputString();
            System.out.println("Enter price");double price = validation.checkInputLong();
            System.out.println("Enter transport");String transport = validation.checkInputTransport();
            System.out.println("Enter day begin");
            Date datebegin = validation.checkInputDate();
            Date dateend = validation.checkInputDate();
            InternationalTour internationalTour = new InternationalTour(superchar,code,title,price,transport,datebegin,dateend);
            Tours.add(internationalTour);
        }else {
            System.out.println("Please check again");
        }
    }

    public void printTour(){
        for(var x: Tours){
            System.out.println(x);
        }
    }

    public void searchTourByMinPrice(){
        System.out.println("Enter price you want to find:");
        double price = Double.parseDouble(scanner.nextLine());
        int count=0;
        for(var x: Tours){
            if(x.tourCharge()>=price){
                System.out.println("Tour find: ");
                System.out.println(x);
                count++;
            }
        }
        if (count==0){
            System.out.println("Not found");
        }
    }

    public void searchByDate(){
        System.out.println("Enter date you want to find:");
        Date date = validation.checkInputDate();
        for(var x: Tours){
            if(x.getStartDay().before(date)){
                System.out.println("Find found");
                System.out.println(x);
            }else {
                System.out.println("Not found the tour");
            }
        }
    }

    public void sortTOur(){
        for(int i=0; i<Tours.size(); i++){
            for(int j=i+1; j<Tours.size(); j++){
                if (Tours.get(i).tourCharge()<Tours.get(j).tourCharge()){
                    Tours.set(i,Tours.get(j));
                    Tours.set(j,Tours.get(i));
                }
            }
        }

        for(int i=0; i<Tours.size(); i++){
            for(int j=i+1; j<Tours.size(); j++){
                if (Tours.get(i).getTitle().equals(Tours.get(j).getTitle())){
                    Tours.set(i,Tours.get(j));
                    Tours.set(j,Tours.get(i));
                }
            }
        }
        System.out.println("After sort");
        printTour();
    }

    public void updateTour() {
        System.out.println("Enter code you want to update");
        String code = scanner.nextLine();
        if (isExist(code) >= 0) {
            if (Tours.get(isExist(code)).getClass().equals(new DomesticTour(2,3))) {
                System.out.println("Enter Tip");
                double tip = validation.checkInputLong();
                System.out.println("Enter code");
                String code1 = validation.checkInputCode();
                System.out.println("Enter title");
                String title = validation.checkInputString();
                System.out.println("Enter price");
                double price = validation.checkInputLong();
                System.out.println("Enter transport");
                String transport = validation.checkInputTransport();
                System.out.println("Enter day begin");
                Date datebegin = validation.checkInputDate();
                Date dateend = validation.checkInputDate();
                DomesticTour domesticTour = new DomesticTour(code1, title, price, transport, datebegin, dateend, tip);
                Tours.set(isExist(code), domesticTour);
            } else if (Tours.get(isExist(code)).getClass().equals(new InternationalTour(3))) {
                System.out.println("Enter Superchar");
                double superchar = validation.checkInputLong();
                System.out.println("Enter code");
                String code1 = validation.checkInputCode();
                System.out.println("Enter title");
                String title = validation.checkInputString();
                System.out.println("Enter price");
                double price = validation.checkInputLong();
                System.out.println("Enter transport");
                String transport = validation.checkInputTransport();
                System.out.println("Enter day begin");
                Date datebegin = validation.checkInputDate();
                Date dateend = validation.checkInputDate();
                InternationalTour internationalTour = new InternationalTour(superchar, code1, title, price, transport, datebegin, dateend);
                Tours.set(isExist(code), internationalTour);
            }
        }
    }

    public void removeTour(){
        System.out.println("Enter code you want to remove");
        String code = scanner.nextLine();
        if(isExist(code)>=0){
            Tours.remove(isExist(code));
        }else{
            System.out.println("Not found to remove");
        }
    }

//    public void searchMin(){
//        int cout=0;
//        System.out.println("Enter price to search");
//        double pricetosearch = Double.parseDouble(scanner.nextLine());
//        for (var x: Tours){
//            if(x.getPrice()==pricetosearch){
//                System.out.println(x);
//                cout++;
//            }
//        }
//        if(cout==0){
//            System.out.println("Not found tour");
//        }
//    }
}
