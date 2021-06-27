    package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.BaiThu2;

    import java.util.Date;

    public class Visit {
        private Customer name;
        private Date date;
        private double serviceExpense;
        private double productExpense;

        DiscountRate discountRate = new DiscountRate();

        public Visit(Customer name, Date date) {
            this.name = name;
            this.date = date;
        }

        public String getName(){
            return name.getName();
        }

        public double getServiceExpense() {
            return serviceExpense;
        }


        public double getProductExpense() {
            return productExpense;
        }




        //
        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = this.serviceExpense + serviceExpense;
        }

        public void setProductExpense(double productExpense) {
            this.productExpense = this.productExpense + productExpense;
        }

        public double getTotalExpense() {
            return  (serviceExpense - (serviceExpense * discountRate.getServiceDiscountRate(name.getMemberType()))) +
                    (productExpense - (productExpense * discountRate.getProductDiscountRate(name.getMemberType())));

        }


        @Override
        public String toString() {
            return "Visit{" +
                    "customer=" + name.toString() +
                    ", date=" + date +
                    ", serviceExpense=" + serviceExpense +
                    ", productExpense=" + productExpense +
                    '}';
        }
    }
