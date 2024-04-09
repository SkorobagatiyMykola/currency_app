package ua.skorobahatyi.currency_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Embeddable
public class CurrencyRateKey implements Serializable {
    @Column(name = "date_id")
    private LocalDate dateId;

    @Column(name = "currency_id")
    private Integer currencyId;
}
