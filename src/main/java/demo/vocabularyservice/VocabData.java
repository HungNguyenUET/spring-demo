package demo.vocabularyservice;

import org.springframework.beans.factory.annotation.Autowired;

public class VocabData {
    private static VocabData instance;

    //private final TreeSet<String> vocabSet;

    private VocabRepository repository;

    public static VocabData getInstance() {
        if (instance == null) {
            instance = new VocabData();
        }

        return instance;
    }

    public void setRepository(VocabRepository repository) {
        this.repository = repository;
    }

    public void addVocab(String word, String sentence) {
        Vocab vocab = new Vocab(word, sentence);
        repository.save(vocab);
    }

    public String getSentenceByWord(String word) {
        Vocab vocab = repository.findByWord(word);
        return vocab.getSentence();
    }
}
