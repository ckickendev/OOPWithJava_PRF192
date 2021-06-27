package Semeter2_OOP_With_Jav_a.WS5.Part2.PlanManagement;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
