package ua.skorobahatyi.currency_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyRateDto;

@RestController
@RequestMapping("/v1/currency_rates")
public class CurrencyRateController {

    @GetMapping("/actual")
    public CurrencyRateDto getActualCurrencyRates(){

        return null;
    }
}
