package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay8.Bai3;

import java.io.*;
import java.util.Vector;


public class DataControler {
    private String filename;

    public DataControler(String filename) {
        this.filename = filename;
    }

    public DataControler() {

    }

    public void writeToFile(Vector<Object> objects) throws IOException {
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (var x : objects){
            oos.writeObject(x);
        }
        oos.close();
        fos.close();
    }

    public void writeToFile(String filename,Object x) throws IOException {
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(x);
        oos.close();
        fos.close();
    }

    public void readFromFile(String filename) throws IOException, ClassNotFoundException {
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object;
        if(ois.readObject()!= null){
            object = ois.readObject();
            System.out.println(object);
        }
    }

}
