package ru.mshatunov.investments.stats.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mshatunov.investments.stats.service.PortfolioService;
import ru.tinkoff.trading.openapi.data.Portfolio;
import ru.tinkoff.trading.openapi.data.PortfolioCurrencies;

@RestController
@RequiredArgsConstructor
public class PortfolioController {

    private final PortfolioService portfolioService;

    @GetMapping("/portfolio")
    public Portfolio getPortfolio() {
        return portfolioService.getPortfolio();
    }

    @GetMapping("/portfolio/currencies")
    public PortfolioCurrencies getPortfolioCurrencies() {
        return portfolioService.getPortfolioCurrencies();
    }
}
