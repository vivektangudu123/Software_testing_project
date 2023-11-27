package org.example.st_pro;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    private BankAccount account= new BankAccount("USD");

    // basic check
    @Test
    public void test_checkbalance() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    // converting money function
    @Test
    public void test_check_defaultcurrency() throws CurrencyNotFoundException{
        CurrencyConverter conv=account. get_CurrencyConverter();
        conv.setExchangeRate("INR",10);
        account.setDefaultCurrency("INR");
        assertEquals("INR", account.getDefaultCurrency());
    }

    //add money validation
    @Test
    public void test_by_adding_money() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        assertEquals(100, account.getBalance(), 0.001);
    }

    // Check the total functionlity of the add money with diff currency types
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


    // Invalid currency type
    @Test(expected = CurrencyNotFoundException.class)
    public void testSetDefaultCurrencyWithInvalidConversion() throws CurrencyNotFoundException{
        account.addMoney(100.0, "USD");
        account.setDefaultCurrency("INVALID");
    }

    // invalid cuurency type
    @Test(expected = CurrencyNotFoundException.class)
    public void test_invalid() throws CurrencyNotFoundException{
        account.addMoney(100.0, "US");
    }


    // Expection error as we are checking with a invalid currency type
    @Test(expected = CurrencyNotFoundException.class)
    public void test_inva() throws CurrencyNotFoundException{
        CurrencyConverter cur=account.get_CurrencyConverter();
        cur.convertFromDefaultCurrency(100,"HA");
    }

    // To conver line coverage, We added this test to check the function convertToDefaultCurrency
    @Test
    public void test_in() throws CurrencyNotFoundException{
        CurrencyConverter cur=new CurrencyConverter();
        cur.setExchangeRate("INR",100);
        assertEquals(10, cur.convertToDefaultCurrency(1000.0,"INR"),0.0001);
    }
    // To conver line coverage, We added this test to check the function convertToDefaultCurrency
    @Test(expected = CurrencyNotFoundException.class)
    public void test_in_() throws CurrencyNotFoundException{
        CurrencyConverter cur=new CurrencyConverter();
        cur.setExchangeRate("INR",100);
        assertEquals(10, cur.convertToDefaultCurrency(1000.0,"IN"),0.0001);
    }


    // Add a value of cuurency with value 0. An check the internal integration of calculator divison.
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