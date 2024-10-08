package com.microservices.currency_conversion_service.service;


import com.microservices.currency_conversion_service.model.Currencyconversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange", url="localhost:8000")
@com.microservices.currency_conversion_service.service.FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public Currencyconversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to);

}
