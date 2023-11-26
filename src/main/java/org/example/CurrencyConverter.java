package org.example.st_pro;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;
    private String defaultCurrency;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        defaultCurrency = "USD"; // Default currency is set to dollars
        initializeExchangeRates();
    }

    private void initializeExchangeRates() {
        // Set initial exchange rates
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85); // Example: 1 USD = 0.85 EUR
        exchangeRates.put("GBP", 0.75); // Example: 1 USD = 0.75 GBP
        // Add more currencies and their exchange rates as needed
    }

    public void setExchangeRate(String currency, double rate) {
        exchangeRates.put(currency, rate);
    }

    public double convertToDefaultCurrency(double amount, String fromCurrency)throws CurrencyNotFoundException{
        if (!exchangeRates.containsKey(fromCurrency)) {
            throw new CurrencyNotFoundException("Invalid currency code");

        }
        double exchangeRate = exchangeRates.get(fromCurrency);
        try{
            Calculator cal=new Calculator("1 4 "+amount+" "+exchangeRate+" =");
            return cal.run();
        }catch(Exception e) {
            throw new MyRuntimeException("Error occurred.");
        }

    }

    public double convertFromDefaultCurrency(double amount, String toCurrency)throws CurrencyNotFoundException {

        if (!exchangeRates.containsKey(toCurrency)) {
            throw new CurrencyNotFoundException("Invalid currency code");

        }


        double exchangeRate = exchangeRates.get(toCurrency);
        Calculator cal=new Calculator("1 3 "+amount+" "+exchangeRate+" =");
        return cal.run();

    }

    public double convert(double amount, String fromCurrency, String toCurrency) throws CurrencyNotFoundException {
        try {
            if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
                throw new CurrencyNotFoundException("Invalid currency code");
            }
            double amountInDefaultCurrency = convertToDefaultCurrency(amount, fromCurrency);
            return convertFromDefaultCurrency(amountInDefaultCurrency, toCurrency);
        } catch (CurrencyNotFoundException e) {
            // You can log the exception or perform other actions if needed
            throw e; // Re-throw the exception to propagate it up
        }
    }


}


