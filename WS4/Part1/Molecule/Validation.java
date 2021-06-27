package Semeter2_OOP_With_Jav_a.WS4.Part1.Molecule;

import java.util.Scanner;

public class Validation {
    private static final Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.err.println("Can Not empty");
                System.out.print("Please Enter again: ");
            }
        }
    }

    public static float checkInputFloat() {
        while (true) {
            float result = in.nextFloat();
            if (result > 0.01) {
                return result;
            } else {
                System.err.println("a positive, less than 0.01 floating point value ");
                System.out.print("Please Enter again: ");
            }
        }
    }
}
