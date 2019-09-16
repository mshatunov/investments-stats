package ru.mshatunov.investments.stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InvestmentStatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(InvestmentStatsApplication.class, args);
    }
}
