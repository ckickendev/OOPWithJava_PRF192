package Semeter2_OOP_With_Jav_a.WS5.Part2.CircleWithSize;

public class View {
    public static void main(String[] args) {
        Circle circle = new Circle(15.7);
        System.out.println("P = " + circle.getPerimeter());
        System.out.println("C = " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(16);
        System.out.println("New radius: " + resizableCircle.resize(50));
        Circle circlenew = new Circle(resizableCircle.resize(50));
        System.out.println("New P: " + circlenew.getPerimeter());
        System.out.println("New C: " + circlenew.getArea());
    }
}
