package com.example.authserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_client_details")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    private String clientId;

    private String resourceIds = "";

    private String clientSecret;

    private String scope = "";

    private String authorizedGrantTypes = "";

    private String webServerRedirectUri = "";

    private String authorities = "";

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private String additionalInformation = "{}";

    private String autoapprove = "";

    public String getClientSecret() {
        return null;
    }
}
