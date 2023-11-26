package org.example.st_pro;
class BankAccount {
    private double balance;
    private static CurrencyConverter converter;
    private String defaultCurrency;

    public BankAccount(String defaultCurrency) {
        balance = 0.0;
        converter = new CurrencyConverter();
        this.defaultCurrency = defaultCurrency;
    }

    public void addMoney(double amount, String currency) throws CurrencyNotFoundException {
        try {
            double amountInDefaultCurrency = converter.convert(amount, currency, defaultCurrency);
            if (amountInDefaultCurrency == -1) {
                throw new CurrencyNotFoundException("Currency not found " + currency);
            } else {
                balance += amountInDefaultCurrency;
            }
        } catch (CurrencyNotFoundException e) {
            // Re-throw the exception to allow it to propagate up
            throw e;
        }
    }

    public void setDefaultCurrency(String currency) throws CurrencyNotFoundException {
        try {
            double balanceInNewDefaultCurrency = converter.convert(balance, defaultCurrency, currency);
            if (balanceInNewDefaultCurrency == -1) {
                throw new CurrencyNotFoundException("Currency not found " + currency);}
            else{
            defaultCurrency = currency;
            balance = balanceInNewDefaultCurrency;}
        } catch (CurrencyNotFoundException e) {
            // You can log the exception or perform any other necessary actions
            throw new CurrencyNotFoundException("Currency not found " + currency);
        }
    }


    public double getBalance() {
        return balance;
    }
    public String getDefaultCurrency(){
        return defaultCurrency;
    }
    public CurrencyConverter get_CurrencyConverter(){
        return converter;
    }
}
