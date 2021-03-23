package demo.vocabularyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VocabApplication implements CommandLineRunner {

    @Autowired
    private VocabRepository repository;

    public static void main(String args[]) {
        SpringApplication.run(VocabApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        VocabData.getInstance().setRepository(repository);
    }
}
