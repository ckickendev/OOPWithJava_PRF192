package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

public class Book extends ShopItem{
    private double weight;

    public Book() {
    }

    public Book(double weight) {
        this.weight = weight;
    }

    public Book(String id, String iName, double price, int iQtt, double weight) {
        super(id, iName, price, iQtt);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ID: "+super.getId() +  ", Book title: " +super.getiName() + ", Price: " +super.getPrice()+
                ", Weight: " +getWeight() +", Number : "+ super.getiQtt();
    }

    public double transportingFee(){
        if(getWeight()<0.5){
            return 5.00;
        }else if(getWeight()<1){
            return 9.50;
        }else{
            return 9.50+7.00*(Math.floor(getWeight())-1);
        }
    }
}
