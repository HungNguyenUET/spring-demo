package hungnv.springdemo.accessdatamongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Lisa", "Smith"));

        System.out.println("Customers found by findAll");
        System.out.println("--------------------------");
        for (Customer customer: repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        System.out.println("Customers found by findByFirstName('Alice')");
        System.out.println("-------------------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found by findLastName('Smith')");
        System.out.println("----------------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }
    }
}
