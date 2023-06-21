package com.azure.project.config;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretClientConfiguration {

    @Value("${spring.cloud.azure.keyvault.secret.endpoint}")
    private String keyVaultURL;

    @Bean
    public SecretClient createSecretClient() {
        return new SecretClientBuilder()
            .vaultUrl(keyVaultURL)
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();
    }

}