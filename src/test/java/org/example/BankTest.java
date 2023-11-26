package org.example.st_pro;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    private BankAccount account= new BankAccount("USD");
    @Test
    public void test_checkbalance() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        assertEquals(100.0, account.getBalance(), 0.001);
    }
    @Test
    public void test_check_defaultcurrency() throws CurrencyNotFoundException{
        CurrencyConverter conv=account. get_CurrencyConverter();
        conv.setExchangeRate("INR",10);
        account.setDefaultCurrency("INR");
        assertEquals("INR", account.getDefaultCurrency());
    }
    @Test
    public void test_by_adding_money() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        assertEquals(100, account.getBalance(), 0.001);
    }
    @Test
    public void test_add_currency()throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        CurrencyConverter conv=account. get_CurrencyConverter();
        conv.setExchangeRate("INR",10);
        account.setDefaultCurrency("INR");
        account.addMoney(100.0, "INR");
        account.addMoney(100.0, "USD");
        assertEquals(2100, account.getBalance(),0.0001);
    }

    @Test(expected = CurrencyNotFoundException.class)
    public void testSetDefaultCurrencyWithInvalidConversion() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        account.setDefaultCurrency("INVALID");
    }
    @Test(expected = CurrencyNotFoundException.class)
    public void test_invalid() throws CurrencyNotFoundException{
        account.addMoney(100.0, "US");
    }
    @Test(expected = CurrencyNotFoundException.class)
    public void test_invali() throws CurrencyNotFoundException{
        CurrencyConverter cur=account.get_CurrencyConverter();
        cur.convertToDefaultCurrency(100,"HA");
    }
    @Test(expected = CurrencyNotFoundException.class)
    public void test_inva() throws CurrencyNotFoundException{
        CurrencyConverter cur=account.get_CurrencyConverter();
        cur.convertFromDefaultCurrency(100,"HA");
    }
    @Test
    public void test_in() throws CurrencyNotFoundException{
        CurrencyConverter cur=new CurrencyConverter();
        cur.setExchangeRate("INR",100);
        assertEquals(10, cur.convertToDefaultCurrency(1000.0,"INR"),0.0001);
    }
    @Test(expected = MyRuntimeException.class)
    public void test_i() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        CurrencyConverter conv=account. get_CurrencyConverter();
        conv.setExchangeRate("INRP",0);
        account.setDefaultCurrency("INRP");
        account.addMoney(100,"INRP");
        account.setDefaultCurrency("USD");
    }
}