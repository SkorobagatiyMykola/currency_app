package ua.skorobahatyi.currency_app.utils;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.stream.StreamSupport;

public class HelperForDB {
    private static String nbuCurrencyUrl = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange/?json";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        var jsonResponse = restTemplate.getForObject(nbuCurrencyUrl, JsonNode.class);

        //findMaxRateAndMaxDecimalScale(jsonResponse);
        //insertDataCurrencyTable(jsonResponse);

    }

    private static void findMaxRateAndMaxDecimalScale(JsonNode jsonResponse) {
        Double maxRate = StreamSupport.stream(jsonResponse.spliterator(), true)
                .map(el -> el.get("rate"))
                .mapToDouble(JsonNode::asDouble)
                .max()
                .orElse(0d);

        int maxDecimalPrecision = StreamSupport.stream(jsonResponse.spliterator(), true)
                .map(el -> el.get("rate"))
                .map(JsonNode::decimalValue)
                .mapToInt(BigDecimal::scale)
                .max().orElse(0);

        System.out.println("Max: " + maxRate);
        System.out.println("maxDecimalPrecision: " + maxDecimalPrecision);
    }

    private static void insertDataCurrencyTable(JsonNode jsonResponse) {
        String template = "INSERT INTO currencies (id, r030, code, name) VALUES (%d, %d,'%s','%s');";

        jsonResponse.elements().forEachRemaining
                (el -> System.out.println(String.format(template,
                        el.get("r030").asInt(),
                        el.get("r030").asInt(),
                        el.get("cc").asText(),
                        el.get("txt").asText()
                )));
    }


}
