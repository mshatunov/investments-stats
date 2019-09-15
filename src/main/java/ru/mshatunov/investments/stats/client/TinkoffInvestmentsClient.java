package ru.mshatunov.investments.stats.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import ru.mshatunov.investments.stats.client.dto.PortfolioCurrenciesResponse;
import ru.mshatunov.investments.stats.client.dto.PortfolioResponse;

@FeignClient(name = "tinkoffInvestmentsClient", url = "${client.host}")
public interface TinkoffInvestmentsClient {
    String AUTHORIZATION_HEADER_NAME = "Authorization";

    @GetMapping("/portfolio")
    PortfolioResponse getPortfolio(@RequestHeader(AUTHORIZATION_HEADER_NAME) String token);

    @GetMapping("/portfolio/currencies")
    PortfolioCurrenciesResponse getPortfolioCurrencies(@RequestHeader(AUTHORIZATION_HEADER_NAME) String token);
}
