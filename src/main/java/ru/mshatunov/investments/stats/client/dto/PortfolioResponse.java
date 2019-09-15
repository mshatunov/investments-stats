package ru.mshatunov.investments.stats.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.tinkoff.trading.openapi.data.Portfolio;

@Data
public class PortfolioResponse {
    @JsonProperty("payload")
    Portfolio portfolio;
}
