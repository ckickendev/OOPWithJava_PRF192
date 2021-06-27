package Semeter2_OOP_With_Jav_a.WS3.Part1.Fraction;

public class Fraction {
    private int number;
    private int denom;

    public Fraction(int number, int denom) {
        this.number = number;
        this.denom = denom;
    }

    void simplify() {
            int gcd = findGCD(number, denom);
            number /= gcd;
            denom /= gcd;
    }

    int findGCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getNumber() {
        return number;
    }

    public int getDenom() {
        return denom;
    }

    Fraction add(Fraction x) {
        Fraction result;
        if (denom == x.denom) {
            result = new Fraction(x.number + number, denom);
            } else {
            int den = denom * x.getDenom();
            int num = number * x.getDenom();
            num += x.getNumber() * denom;
            result = new Fraction(num, den);
            }
        return result;
    }

    Fraction subtract(Fraction x) {
        Fraction result;

        if (x.denom == denom) {
            result = new Fraction(x.number - number, denom);
            } else {
            int den = denom * x.getDenom();
            int num = number * x.getDenom();
            num -= x.getNumber() * denom;
            result = new Fraction(num, den);
            }
        return result;
    }

    Fraction multiply(Fraction x){
        Fraction result = new Fraction(x.number*number, denom*x.denom);
        return result;
    }

    Fraction divine(Fraction x){
        Fraction y = new Fraction(x.denom, x.number);
        return multiply(y);
    }

    public boolean equals(Fraction x) {
        boolean result = false;
        if (number == x.number && denom == x.denom) {
            result = true;
            }
        return result;
    }

    @Override
    public String toString() {
        return (Integer.toString(number) + "/"
        + Integer.toString(denom));
    }
}

