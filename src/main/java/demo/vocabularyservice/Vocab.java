package demo.vocabularyservice;

import org.springframework.data.annotation.Id;

public class Vocab {

    @Id
    public String id;

    public String word;
    public String sentence;

    public Vocab() {}

    public Vocab(String word, String sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
