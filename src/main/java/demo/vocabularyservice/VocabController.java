package demo.vocabularyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VocabController {
    private VocabData vocabData = VocabData.getInstance();

    @GetMapping("/add")
    public String addVocab(@RequestParam(value = "word", defaultValue = "") String word) {
        if (word.isBlank() || word.isEmpty())
            return "ERROR: " + word + " is invalid";

        if (vocabData.isExisted(word))
            return "This word is existed";

        System.out.println("Add Word: " + word);
        vocabData.addWord(word);

        return "Success add word " + word + " to collection";
    }

    @GetMapping("/get")
    public String getVocab() {
        System.out.println("Get a random word");

        if (vocabData.isEmpty())
            return "Data is empty now";

        return vocabData.getWord();
    }

}
