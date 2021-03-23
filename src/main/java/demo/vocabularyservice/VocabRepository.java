package demo.vocabularyservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VocabRepository extends MongoRepository<Vocab, String> {

    public Vocab findByWord(String word);

}
