package ua.skorobahatyi.currency_app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.skorobahatyi.currency_app.entity.Currency;

import java.util.List;

@RestController
@RequestMapping("/v1/currency")
public class CurrencyController {

    @GetMapping("")
    public List<Currency> getRateCurrencyByDate(){
        return null;

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
