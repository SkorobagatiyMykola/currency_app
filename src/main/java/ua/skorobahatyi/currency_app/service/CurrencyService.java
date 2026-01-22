package ua.skorobahatyi.currency_app.service;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import ua.skorobahatyi.currency_app.entity.CurrencyRate;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyDto;
import ua.skorobahatyi.currency_app.repository.CurrencyRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


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
    }

    public List<CurrencyRate> getAllCurrencyRate() {
        var jsonResponse = restTemplate.getForObject(nbuCurrencyUrl, JsonNode.class);

//        List<CurrencyRate> rates = StreamSupport.stream(jsonResponse.spliterator(), true)
//                .map(el -> new CurrencyRate(el.get(""),,))
//                //.mapToDouble(JsonNode::asDouble)
//                .collect(Collectors.toList());

        return null;
    }

}
