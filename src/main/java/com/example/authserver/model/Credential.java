package com.example.authserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Credential {

    @Id
    private String username;

    private String password;

    private String authorities;

    public String[] getAuthorities() {
        return authorities.split(",");
    }

    public void setAuthorities(String... authorities) {
        this.authorities = String.join(",", authorities);
    }
}
