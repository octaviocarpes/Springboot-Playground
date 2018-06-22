package salesservice.salesservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import salesservice.salesservice.pojo.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

    public Client findById(int id);

}
