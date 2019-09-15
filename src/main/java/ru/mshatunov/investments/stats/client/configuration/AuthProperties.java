package ru.mshatunov.investments.stats.client.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "client")
public class AuthProperties {
    @NotEmpty
    private String token;
    @NotEmpty
    private String host;
}
