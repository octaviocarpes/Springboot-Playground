package userservice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userservice.userservice.domain.Client;
import userservice.userservice.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public Client getClientById(String id){
        return repository.findClientById(id);
    }

    public Client getClientByEmail(String email){
        return repository.findClientByEmail(email);
    }

    public Client create(String name, String email, String username){
        Client client = new Client();
        client.setEmail(email);
        client.setName(name);
        client.setUsername(username);
        repository.save(client);
        return client;
    }


}
