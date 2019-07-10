package Classwork0907.ArrayListVariant;

public class Word implements Comparable {
    private String word;
    private int freq;

    @Override
    public int compareTo(Object o) {
        Word word1 = (Word) o;
        return this.word.compareTo(word1.word);
    }

    public Word(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

}
