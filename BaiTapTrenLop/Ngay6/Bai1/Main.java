package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay6.Bai1;

public class Main {
    public static void main(String[] args) {
        FormatPattern test1 = new FormatPattern(123456.789, "###,###.###");
        System.out.println(test1.display());
        FormatPattern test2 = new FormatPattern(123456.789, "###.##");
        System.out.println(test2.display());
        FormatPattern test3 = new FormatPattern(123.78, "000000.000");
        System.out.println(test3.display());
        FormatPattern test4 = new FormatPattern(1234.567, "$###,###.###");
        System.out.println(test4.display());
    }
}
