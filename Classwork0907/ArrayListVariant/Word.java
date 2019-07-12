package Classwork0907.ArrayListVariant;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, freq);
    }
}
