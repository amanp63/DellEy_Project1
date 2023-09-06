package ey_10;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatAPI {

    public static void main(String[] args) {

        long number = 50000L;

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("Number Format Using Default: " + nf.format(number));

        NumberFormat italyNF = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("Number Format Using Italy: " + italyNF.format(number));

        NumberFormat defaultCurrency = NumberFormat.getCurrencyInstance();
        System.out.println("Number Format Using Default Currency: " + defaultCurrency.format(number));

        NumberFormat usingItalianCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Number Format Using Italian Currency: " + usingItalianCurrency.format(number));
        
        Currency usd = Currency.getInstance("USD");
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Number Format Using Italy: "+ usCurrency.format(1234));
    }
}