package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadData {
    private String filename;

    public ReadData(String filename) {
        this.filename = filename;
    }

    public void ReadFile(){
        File file = new File(filename);
        FileReader fileReader ;
        try{
            fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine())!=null) {
                System.out.println("" + line);
            }
            br.close();
            fileReader.close();
            file.exists();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
