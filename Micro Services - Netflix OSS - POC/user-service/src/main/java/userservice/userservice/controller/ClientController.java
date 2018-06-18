package userservice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userservice.userservice.domain.Client;
import userservice.userservice.dto.CreateClientRequestDTO;
import userservice.userservice.dto.CreateClientResponseDTO;
import userservice.userservice.service.ClientService;

@RestController(value="users")
public class ClientController {

    @Autowired
    ClientService service;


    @GetMapping("/users/email/")
    public ResponseEntity<Client> getUserByEmail(@RequestParam(name = "email") String email){
        return ResponseEntity.ok(service.getClientByEmail(email));
    }

    @GetMapping()
    public ResponseEntity<Client> getUserById(@RequestParam(name = "id") String id){
        return ResponseEntity.ok(service.getClientById(id));
    }

    @PostMapping()
    public ResponseEntity<CreateClientResponseDTO> registerUser(@RequestBody CreateClientRequestDTO dto){
        Client client = service.create(dto.getName(), dto.getEmail(), dto.getUsername());
        CreateClientResponseDTO response = new CreateClientResponseDTO(client.getName(), client.getEmail(), client.getUsername());
        return ResponseEntity.ok(response);
    }
}
