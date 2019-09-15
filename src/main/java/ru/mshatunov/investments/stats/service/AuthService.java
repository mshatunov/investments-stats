package ru.mshatunov.investments.stats.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mshatunov.investments.stats.client.configuration.AuthProperties;

@Service
@RequiredArgsConstructor
public class AuthService {
    private static final String AUTH_HEADER = "Bearer ";

    private final AuthProperties properties;

    public String getAuthToken() {
        return AUTH_HEADER + properties.getToken();
    }
}
