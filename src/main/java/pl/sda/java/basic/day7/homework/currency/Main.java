package pl.sda.java.basic.day7.homework.currency;

import java.math.BigDecimal;


/**
 * @author Michal Jaszczyk
 **/
public class Main {
    private static CurrencyExchange currencyExchange = new CurrencyExchange();
    public static void main(String[] args) {
        buy("GBP", new BigDecimal(125));
        buy("USD", new BigDecimal(1320.35f));
        buy("CAD", new BigDecimal(10)); // Próba kupna nieistniejącej waluty

        sell("GBP", new BigDecimal(125));
        sell("USD", new BigDecimal(1320.35));
        sell("CAD", new BigDecimal(10)); // Próba sprzedaży nieistniejącej waluty
    }

    private static void buy(String currency, BigDecimal amount) {
        System.out.println("Chciałbym kupić: " + amount + currency);
        try { // Metoda buy może rzucić wyjątkiem, więc otaczamy ją w blok try catch
            System.out.println("Zapłacisz: " + currencyExchange.buy(currency, amount) + " PLN");
        } catch (CurrencyNotFound exception) { // Jeżeli poleciał wyjątek to znaczy, że nie było takiej waluty
            System.out.println("Brak waluty: " + currency);
        }
    }

    private static void sell(String currency, BigDecimal amount) {
        System.out.println("Chciałbym sprzedać: " + amount + currency);
        try { // Metoda sell może rzucić wyjątkiem, więc otaczamy ją w blok try catch
            System.out.println("Dostaniesz: " + currencyExchange.sell(currency, amount) + " PLN");
        } catch (CurrencyNotFound exception) { // Jeżeli poleciał wyjątek to znaczy, że nie było takiej waluty
            System.out.println("Brak waluty: " + currency);
        }
    }
}
