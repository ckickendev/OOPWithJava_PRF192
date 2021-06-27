    package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.JobDemo;

    public class Job {
        public static int count=0;
        private int jobId;
        private String title;
        private boolean isfilled;

        public Job(){

        }

        public Job(String title) {
            this.title = title;
            isfilled = false;
            jobId =++count;
        }



        @Override
        public String toString() {
            return "Job{" +
                    "ID=" + jobId +
                    ", title='" + title + '\'' +
                    ", isfilled=" + isfilled +
                    '}';
        }
    }
