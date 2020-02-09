package com.example.authserver.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserInfoController {

    @GetMapping
    public Map<String, Object> getAuthenticatedInfo(OAuth2Authentication user) {
        return new HashMap<String, Object>() {{
            put("user", user.getUserAuthentication().getPrincipal());
            put("authorities", user.getUserAuthentication().getAuthorities());
        }};
    }
}
