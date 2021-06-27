package Semeter2_OOP_With_Jav_a.WS5.Part2.Shape;

public class View {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 10.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;
        System.out.println("");
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        Shape s3 = new Rectangle("BLUE", false, 5.0, 7.0);
        System.out.println("");
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println("");
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square("BLUE", true, 10.2);
        System.out.println("");
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println("");
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square) s4).getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println("");
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
