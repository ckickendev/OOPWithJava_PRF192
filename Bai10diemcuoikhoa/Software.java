package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

public class Software extends ShopItem{
    private int noCd;

    public Software() {
    }

    public Software(int noCd) {
        this.noCd = noCd;
    }

    public Software(String id, String iName, double price, int iQtt, int noCd) {
        super(id, iName, price, iQtt);
        this.noCd = noCd;
    }

    public int getNoCd() {
        return noCd;
    }

    public void setNoCd(int noCd) {
        this.noCd = noCd;
    }

    public double transportingFee(){
        if(getNoCd()<=3){
            return getNoCd()*3.25;
        }else {
            return 3*3.25 + (getNoCd()-3)*1.5;
        }
    }

    @Override
    public String toString() {
        return "ID: "+ super.getId()+ ", Software Title: " + super.getiName() + ", Price: " + super.getPrice()+
                ", Num of CD: " +getNoCd() +", Number: "+ super.getiQtt();
    }
}
