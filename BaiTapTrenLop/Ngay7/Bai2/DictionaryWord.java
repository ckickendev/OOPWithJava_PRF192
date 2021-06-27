package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai2;

public class DictionaryWord {
    private String word;
    private String meanings;

    public DictionaryWord(String word, String meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }

    @Override
    public String toString() {
        return "DictionaryWord{" +
                "word='" + word + "    " +
                ", meanings='" + meanings + '\'' +
                '}';
    }
}
