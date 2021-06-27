package Semeter2_OOP_With_Jav_a.WS5.Part2.ShapeManagement;

public class View {
    public static void main(String[] args) {
        Shape shape = new Shape("Black",false);


        if(shape.isFilled()==true){
            System.out.println("Shape have color: "+shape.getColor()+" and filled color");
        }else {
            System.out.println("Shape have color: "+shape.getColor()+" and not filled color");
        }

        Circle circle = new Circle("red", true, 10.5);
        System.out.println(circle);

        Rectangles rectangles = new Rectangles("blue", true, 4.0, 4.0);
        System.out.println(rectangles);

        Square square = new Square(4, "pink", true);
        System.out.println(square);
    }
}
