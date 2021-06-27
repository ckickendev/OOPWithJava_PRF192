package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.Employee;

public class view {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Do", "Nguyen", 13);
        System.out.println(employee);
        System.out.println("Annual Salary: "+ employee.getAnnualSalary());
        System.out.println("Raise Salary: " + employee.raiseSalary(10.0));

    }
}
