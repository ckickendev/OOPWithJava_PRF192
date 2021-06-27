package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.JobDemo;

import java.util.ArrayList;


public class JobTest {
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        Job job1 = new Job("IT");
        Job job2 = new Job("AI");
        Job job3 = new Job("ML");
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        for(var x: jobs){
            System.out.println(x);
        }
        System.out.println("so job: " + Job.count);
    }
}
