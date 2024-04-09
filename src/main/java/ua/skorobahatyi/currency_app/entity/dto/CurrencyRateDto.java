package ua.skorobahatyi.currency_app.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyRateDto {
    @JsonProperty("date")
    private LocalDate date;
    @JsonProperty("currencies")
    private List<CurrencyDto> currencyDtoList;
}
