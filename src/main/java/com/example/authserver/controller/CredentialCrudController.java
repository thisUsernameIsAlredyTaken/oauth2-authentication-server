package com.example.authserver.controller;

import com.example.authserver.model.Credential;
import com.example.authserver.repository.CredentialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("credential")
public class CredentialCrudController {

    @Autowired
    private CredentialRepo credentialRepo;

    @GetMapping("{id}")
    public Credential findCredentialById(@PathVariable String id) {
        return credentialRepo.findById(id).orElse(null);
    }

    @GetMapping
    public List<Credential> findAllCredentials() {
        return credentialRepo.findAll();
    }

    @PostMapping void addNewCredential(@RequestBody Credential credential) {
        credentialRepo.save(credential);
    }
}
