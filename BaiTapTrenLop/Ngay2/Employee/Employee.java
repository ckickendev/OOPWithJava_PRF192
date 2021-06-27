package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.Employee;

public class Employee {
    public int id;
    public String firstName;
    public String lastname;
    public int salary;

    public Employee(int id, String firstName, String lastname, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public double raiseSalary(double percent){
        return salary*((100+ percent)/100.0);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
