package userservice.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import userservice.userservice.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client,String>{

    public Client findClientById(String id);
    public Client findClientByEmail(String email);

}
