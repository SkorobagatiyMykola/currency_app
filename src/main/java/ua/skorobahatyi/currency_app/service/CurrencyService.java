package ua.skorobahatyi.currency_app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyDto;
import ua.skorobahatyi.currency_app.repository.CurrencyRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CurrencyService {
    @Value("${bank.gov.ua.currency.url}")
    private String nbuCurrencyUrl;
    private final RestTemplate restTemplate;
    private final CurrencyRepository currencyRepository;


    @Transactional(readOnly = true)
    public List<CurrencyDto> getAllCurrency() {
        return currencyRepository.findTotalCurrenciesDto();
        /*return currencyRepository.findAll()
                .stream()
                .map(c->new CurrencyDto(c.getCode(),c.getName()))
                .toList();*/
    }

}
