package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.BaiThu2;

public class DiscountRate {
    public double serviceDiscountPremium=0.2;
    public double serviceDiscountGold=0.15;
    public double serviceDiscountSilver=0.1;
    public double productDiscountPremium=0.2;
    public double productDiscountGold=0.15;
    public double productDiscountSilver=0.1;


    public DiscountRate() {
    }

    public double getServiceDiscountRate(String type){
        if(type == "Premium"){
            return serviceDiscountPremium;
        }
        else if(type == "Gold"){
            return serviceDiscountGold;
        }
        else if(type == "Silver"){
            return serviceDiscountSilver;
        }
        return 0;
    }

    public double getProductDiscountRate(String type){
        if(type == "Premium"){
            return productDiscountPremium;
        }
        else if(type == "Gold"){
            return productDiscountGold;
        }
        else if(type == "Silver"){
            return productDiscountSilver;
        }
        return 0;
    }
}
