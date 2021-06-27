package Semeter2_OOP_With_Jav_a.WS7.Part1;

public class View {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.add("bank robber", "Steals money from a bank");
        manager.add("burglar","Breaks into a home to steal things");
        manager.add("forger", "Makes an illegal copy of something");
        manager.add("hacker", "Breaks into a computer system");
        manager.add("hijacker", "Takes control of an airplane");
        manager.add("kidnapper","Holds someone for ransom money");
        manager.add("mugger", "Attacks and steals money from someone");
        manager.add("murderer", "Kills another person");

        manager.display();
    }
}
