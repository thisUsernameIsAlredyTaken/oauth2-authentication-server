package com.example.authserver.controller;

import com.example.authserver.model.Client;
import com.example.authserver.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientCrudController {

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("{id}")
    public Client findClientById(@PathVariable String id) {
        return clientRepo.findById(id).orElse(null);
    }

    @PostMapping
    public void addNewClient(@RequestBody Client client) {
        clientRepo.save(client);
    }

    @GetMapping
    public List<Client> findAllClients() {
        return clientRepo.findAll();
    }
}
