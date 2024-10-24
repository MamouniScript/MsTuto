package com.example.achat.entities;

import java.util.Map;

public class ExchangeRateResponse {
    private String baseCode;  // Corresponds to "base_code" in the API response
    private Map<String, Double> conversionRates; // Corresponds to "conversion_rates" in the API response

    // Getter and Setter for baseCode
    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    // Getter and Setter for conversionRates
    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }
}

