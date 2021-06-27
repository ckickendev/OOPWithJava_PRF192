package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.InnerClass;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();

        CPU.Ram ram = cpu.new Ram();

        System.out.println("Process cache: "+ processor.getCache());
        System.out.println("Process Clock Speed: "+ ram.getClockSpeed());
    }
}
