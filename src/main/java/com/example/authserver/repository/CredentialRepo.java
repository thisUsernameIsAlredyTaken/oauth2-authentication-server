package com.example.authserver.repository;

import com.example.authserver.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepo extends JpaRepository<Credential, String> {
}
