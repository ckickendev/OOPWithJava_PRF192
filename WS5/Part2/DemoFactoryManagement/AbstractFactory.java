package Semeter2_OOP_With_Jav_a.WS5.Part2.DemoFactoryManagement;

abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract LOAN getLoan(String loan);
}
