package ua.skorobahatyi.currency_app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyRateDto;
import ua.skorobahatyi.currency_app.service.CurrencyService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/currency_rates")
public class CurrencyRateController {
    private final CurrencyService currencyService;

    @GetMapping("/actual")
    public CurrencyRateDto getActualCurrencyRates(){

        return null;
    }
}
