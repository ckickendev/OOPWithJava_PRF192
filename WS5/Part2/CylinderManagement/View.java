package Semeter2_OOP_With_Jav_a.WS5.Part2.CylinderManagement;

public class View {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder 2:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());


        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
