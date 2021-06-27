package Semeter2_OOP_With_Jav_a.WS5.Part2.CircleWithSize;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle() {
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent){
        return super.getRadius()*percent/100;
    }
}
