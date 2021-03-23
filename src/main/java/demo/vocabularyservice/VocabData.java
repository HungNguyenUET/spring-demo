package demo.vocabularyservice;

import java.util.TreeSet;

public class VocabData {
    private static VocabData instance;

    private final TreeSet<String> vocabSet;

    private VocabData() {
        vocabSet = new TreeSet<>();
    }

    public static VocabData getInstance() {
        if (instance == null) {
            instance = new VocabData();
        }

        return instance;
    }

    public boolean isEmpty() {
        return vocabSet.isEmpty();
    }

    public boolean isExisted(String world) {
        return vocabSet.contains(world);
    }

    public void addWord(String word) {
        vocabSet.add(word);
    }

    public String getWord() {
        return vocabSet.first();
    }

    public int getSize() {
        return vocabSet.size();
    }
}
