package ua.skorobahatyi.currency_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Entity(name = "currency_rates")
public class CurrencyRate {

    @EmbeddedId
    private CurrencyRateKey  id;

    @ManyToOne
    @MapsId("dateId")
    @JoinColumn(name = "date_id")
    private DateDB dateDB;

    @ManyToOne
    @MapsId("currencyId")
    @JoinColumn(name = "currency_id")
    private Currency currency;

    private BigDecimal rate;

    public static CurrencyRate buildCurrencyRateFromNBU(){
        return null;
    }
}
