package Semeter2_OOP_With_Jav_a.WS4.Part1.Atom;

public class Atom {
    private int number;
    private String symbol;
    private String fullname;
    private float weight;

    public Atom() {
    }

    public Atom(int number, String symbol, String fullname, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "number=" + number +
                ", symbol='" + symbol + '\'' +
                ", fullname='" + fullname + '\'' +
                ", weight=" + weight +
                '}';
    }
}
