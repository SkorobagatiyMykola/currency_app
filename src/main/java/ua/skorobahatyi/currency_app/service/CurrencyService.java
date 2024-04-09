package ua.skorobahatyi.currency_app.service;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.StreamSupport;


@Service
@RequiredArgsConstructor
public class CurrencyService {
    @Value("${bank.gov.ua.currency.url}")
    private String nbuCurrencyUrl;
    private final RestTemplate restTemplate;


    public void getAllCurrency() {
        System.out.println(nbuCurrencyUrl);
    }

}
