package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay6.Bai1;

import java.text.DecimalFormat;

public class FormatPattern {
    private Double value;
    private String pattern;

    public FormatPattern() {
    }

    public FormatPattern(Double value, String pattern) {
        this.value = value;
        this.pattern = pattern;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String display(){
        DecimalFormat formater = new DecimalFormat(pattern);
        String output = formater.format(value);
        return output;
    }


}
