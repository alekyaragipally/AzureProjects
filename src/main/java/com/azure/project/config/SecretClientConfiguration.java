package com.azure.project.config;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretClientConfiguration {

    @Value("${spring.cloud.azure.key-vault.secret.endpoint}")
    private String keyVaultURL;

    @Value("${azure.client-id}")
    private String clientId;

    @Bean
    public SecretClient createSecretClient() {
        DefaultAzureCredential defaultCredential = new DefaultAzureCredentialBuilder()
                .managedIdentityClientId(clientId)
                .build();
        return new SecretClientBuilder()
                .vaultUrl(keyVaultURL)
                .credential(defaultCredential)
                .buildClient();
    }

}