package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDate {
    private String[] data;
    private String filename;

    public WriteDate(String[] data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    public void writeData(){
        try{
            File file = new File(filename);
            FileWriter fw = new FileWriter(file);
            for(int i =0; i< data.length; i++){
                fw.write(data[i]);
            }
            fw.close();
            file.exists();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
