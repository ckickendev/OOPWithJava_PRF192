package Semeter2_OOP_With_Jav_a.WS7.Part1;

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

    public void sort(){
        for(int i=0; i<dictionaryWords.size(); i++){
            for(int j=i+1; j<dictionaryWords.size(); j++){
                if(dictionaryWords.get(i).getWord().compareTo(dictionaryWords.get(j).getWord())>0){
                    DictionaryWord d = new DictionaryWord();
                    d = dictionaryWords.get(i);
                    dictionaryWords.set(i,dictionaryWords.get(j));
                    dictionaryWords.set(j,d);
                }
            }
        }
    }

    public void display(){
        sort();
        System.out.println("Display: LinearS list");
        for(var x : dictionaryWords){
            System.out.println("No: " + (dictionaryWords.indexOf(x)+1) + " Word: " + x.getWord());
            System.out.println("Meaning: "+ x.getMeanings());
        }
    }
}
