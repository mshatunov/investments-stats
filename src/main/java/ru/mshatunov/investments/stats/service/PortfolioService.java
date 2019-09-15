package ru.mshatunov.investments.stats.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mshatunov.investments.stats.client.TinkoffInvestmentsClient;
import ru.tinkoff.trading.openapi.data.Portfolio;
import ru.tinkoff.trading.openapi.data.PortfolioCurrencies;

@Slf4j
@Service
@RequiredArgsConstructor
public class PortfolioService {

    private final TinkoffInvestmentsClient investmentsClient;
    private final AuthService authService;

    public Portfolio getPortfolio() {
        return investmentsClient.getPortfolio(authService.getAuthToken())
                .getPortfolio();
    }

    public PortfolioCurrencies getPortfolioCurrencies() {
        return investmentsClient.getPortfolioCurrencies(authService.getAuthToken())
                .getPortfolioCurrencies();
    }
}
