package ua.skorobahatyi.currency_app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.skorobahatyi.currency_app.entity.Currency;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyDto;
import ua.skorobahatyi.currency_app.service.CurrencyService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/currency")
public class CurrencyController {

    private final CurrencyService currencyService;
    @GetMapping("")
    public List<CurrencyDto> getRateCurrencyByDate(){
        return currencyService.getAllCurrency();

    }
    @GetMapping("/actual")
    public List<Currency> getActualRateCurrency(){
        return null;

    }


    @DeleteMapping("/actual")
    public void deleteRateCurrencyByDate(){
        return ;

    }
}
