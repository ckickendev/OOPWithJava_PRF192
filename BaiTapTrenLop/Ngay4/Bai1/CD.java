package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai1;

public class CD {
    private int cdId;
    private String cdTitle;
    private String cdSingle;
    private int cdNumberSongs;
    private double cdPrice;

    public CD() {
    }

    public CD(int cdId, String cdTitle, String cdSingle, int cdNumberSongs, double cdPrice) {
        this.cdId = cdId;
        this.cdTitle = cdTitle;
        this.cdSingle = cdSingle;
        this.cdNumberSongs = cdNumberSongs;
        this.cdPrice = cdPrice;
    }

    public int getCdId() {
        return cdId;
    }

    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    public String getCdSingle() {
        return cdSingle;
    }

    public void setCdSingle(String cdSingle) {
        this.cdSingle = cdSingle;
    }

    public int getCdNumberSongs() {
        return cdNumberSongs;
    }

    public void setCdNumberSongs(int cdNumberSongs) {
        this.cdNumberSongs = cdNumberSongs;
    }

    public double getCdPrice() {
        return cdPrice;
    }

    public void setCdPrice(double cdPrice) {
        this.cdPrice = cdPrice;
    }

    @Override
    public String toString() {
        return "CD{" +
                "cdId=" + cdId +
                ", cdTitle='" + cdTitle + '\'' +
                ", cdSingle='" + cdSingle + '\'' +
                ", cdNumberSongs=" + cdNumberSongs +
                ", cdPrice=" + cdPrice +
                '}';
    }
}
