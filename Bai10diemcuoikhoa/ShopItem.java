package Semeter2_OOP_With_Jav_a.Bai10diemcuoikhoa;

public class ShopItem implements Comparable<ShopItem>, Item {
    private String id;
    private String iName;
    private double price;
    private int iQtt;

    public ShopItem() {
    }

    public ShopItem(String id, String iName, double price, int iQtt) {
        this.id = id;
        this.iName = iName;
        this.price = price;
        this.iQtt = iQtt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getiQtt() {
        return iQtt;
    }

    public void setiQtt(int iQtt) {
        this.iQtt = iQtt;
    }

    @Override
    public int compareTo(ShopItem o){
        return this.id.compareTo(o.id);
    }

    @Override
    public double transportingFee() {
        return 0;
    }

    public double total(){
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "id='" + id + '\'' +
                ", iName='" + iName + '\'' +
                ", price=" + price +
                ", iQtt=" + iQtt +
                '}';
    }
}
