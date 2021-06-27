package Semeter2_OOP_With_Jav_a.WS3.Part1.Fraction;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction a = new Fraction(10,4);
        Fraction b = new Fraction(19, 4);
        System.out.println("A: " + a.toString());
        System.out.println("B: " + b.toString());

        Fraction c = a.add(b);
        c.simplify();
        System.out.println(c.toString());
        System.out.println(" ");
        c = a.subtract(b);
        c.simplify();
        System.out.println(c.toString());
        System.out.println(" ");
        c = a.multiply(b);
        c.simplify();
        System.out.println(c.toString());
        System.out.println(" ");
        c = a.divine(b);
        c.simplify();
        System.out.println(c.toString());
        System.out.println(" ");
    }
}
