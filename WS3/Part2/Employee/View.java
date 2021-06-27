package Semeter2_OOP_With_Jav_a.WS3.Part2.Employee;

public class View {
    public static void main(String[] args) {
        Employee employee = new Employee(150067, "Do", "Nguyen", 1500);
        System.out.println("Name: "+ employee.getName());
        System.out.println("First Name: "+ employee.getFirstName());
        System.out.println("Last Name: "+ employee.getLastName());
        System.out.println("Salary: "+ employee.getSalary());
        System.out.println("Full name: "+ employee.getName());
        System.out.println("Salary after bonus: "+ employee.raiseSalary(10.5));
        System.out.println("Salary per year: "+ employee.getAnnualSalary());
        System.out.println(employee);
    }
}
