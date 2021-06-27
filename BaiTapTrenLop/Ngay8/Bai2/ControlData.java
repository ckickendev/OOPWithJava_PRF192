package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai2;

import java.io.*;

public class ControlData {
    private String file;

    public ControlData(String file) {
        this.file = file;
    }

    public void writeData(Book data) throws FileNotFoundException, IOException {
        File file = new File(getFile());
        FileOutputStream fos = new FileOutputStream(file);
        fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(data);
        oos.close();
        fos.close();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
