package ua.skorobahatyi.currency_app.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;


@Data
@Setter@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyDto {

    @JsonProperty("r030")
    private Integer r030;
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;
}
