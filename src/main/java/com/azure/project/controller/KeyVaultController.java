package com.azure.project.controller;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keyVault")
public class KeyVaultController {

    private final SecretClient secretClient;

    public KeyVaultController(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    @GetMapping("/getSecrets")
    public String getSecrets(){
        return secretClient.getSecret("keyVaultId").getValue();
    }

    @GetMapping("/test")
    public String test(){
        return "Hello, I'm deployed using Azure cloud";
    }

}
