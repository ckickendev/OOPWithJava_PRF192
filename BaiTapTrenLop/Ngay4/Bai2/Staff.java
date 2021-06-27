package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai2;

public class Staff extends Person{
    private String jobposition;

    public Staff() {
    }

    public Staff(String jobposition) {
        this.jobposition = jobposition;
    }

    public Staff(String id, String name, String jobposition) {
        super(id, name);
        this.jobposition = jobposition;
    }

    public String getJobposition() {
        return jobposition;
    }

    public void setJobposition(String jobposition) {
        this.jobposition = jobposition;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobposition='" + jobposition + '\'' +
                '}';
    }
}
