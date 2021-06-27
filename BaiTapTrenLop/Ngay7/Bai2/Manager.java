package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai2;

import java.util.ArrayList;

public class Manager {
    ArrayList<DictionaryWord> dictionaryWords = new ArrayList<>();

    public void add(String word, String mean){
        DictionaryWord dictionaryWord = new DictionaryWord(word, mean);
        dictionaryWords.add(dictionaryWord);
    }

    public void remove(String index){
        dictionaryWords.remove(index);
    }

    public void display(){
        System.out.println("Display: LinearS list");
        for(var x : dictionaryWords){
            System.out.println(x);
        }
    }
}
