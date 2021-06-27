package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.InnerClass;

public class CPU {

    double  price;
    class Processor{
        double cores;
        String manufacture;

        double getCache(){
            return 4.3;
        }
    }

    protected  class Ram{
        double memory;
        String manufacture;
        double getClockSpeed(){
            return 5.5;
        }
    }
}
