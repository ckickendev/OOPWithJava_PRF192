package Semeter2_OOP_With_Jav_a.WS5.Part2.PlanManagement;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated");
        Scanner scanner = new Scanner(System.in);
        String planName = scanner.nextLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(scanner.nextLine());
//        Plan p = new getPlanFactory.getPlan(planName);
    }
}
