package springdemo.accessdatamongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstname);

    public List<Customer> findByLastName(String lastName);
}
