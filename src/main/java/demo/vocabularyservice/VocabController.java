package demo.vocabularyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VocabController {
    private VocabData vocabData = VocabData.getInstance();

    @GetMapping("/add")
    public String addVocab(@RequestParam(value = "word", defaultValue = "") String word,
                           @RequestParam(value = "sentence", defaultValue = "") String sentence) {
        System.out.println("add word: " + word);

        if (word.isEmpty())
            return "ERROR: " + word + " is invalid";

        System.out.println("Add Word: " + word + ", sentence: " + sentence);
        vocabData.addVocab(word, sentence);

        return "Success add word: " + word + " with sentence: " + sentence + " to collection";
    }

    @GetMapping("/get")
    public String getVocab(@RequestParam(value = "word", defaultValue = "") String word) {
        System.out.println("Get a example sentence by word");

        return vocabData.getSentenceByWord(word);
    }

}
