package pl.sda.java.basic.day7.homework.currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Michal Jaszczyk
 **/
public class CurrencyExchange {

    // public static final - dobra praktyka jeśli chcemy dać możliwość korzystania z naszej stałej innym klasom
    public static final RoundingMode ROUNDING_MODE = RoundingMode.CEILING;

    // Kupowanie waluty
    public BigDecimal buy(String currencyToBuy, BigDecimal amount) throws CurrencyNotFound {
        // Zamiana stringa na obiekt typu Currency
        Currency currency = getCurrency(currencyToBuy);
        // Pobranie kursu dla waluty
        BigDecimal buyRate = currency.getBuyRate();
        // Pomnożenie ilości waluty przez kurs oraz zaokrąglenie wyniku do 2 miejsc po przecinku (zaokrąglając w górę)
        return amount.multiply(buyRate).setScale(2, ROUNDING_MODE);
    }

    // Sprzedawanie waluty
    public BigDecimal sell(String currencyToBuy, BigDecimal amount) throws CurrencyNotFound {
        // Zamiana stringa na obiekt typu Currency
        Currency currency = getCurrency(currencyToBuy);
        // Pomnożenie ilości waluty przez kurs oraz zaokrąglenie wyniku do 2 miejsc po przecinku (zaokrąglając w górę)
        return amount.multiply(currency.getSellRate()).setScale(2, ROUNDING_MODE);
    }

    // Zamiana stringa na obiekt Currency
    private Currency getCurrency(String currencyToBuy) throws CurrencyNotFound { // metoda może rzucić wyjątek typu CurrencyNotFound
        try { // w bloku try piszemy kod, który może rzucić wyjątkiem
            return Currency.valueOf(currencyToBuy); // pobieramy obiekt enuma na podstawie jego nazwy. Jeżeli nie ma takiego enuma to rzucony jest wyjątek  IllegalArgumentException
        } catch (IllegalArgumentException exception) { // w bloku catch łapiemy podany wyjątek
            // Po złapaniu wyjątku zamieniamy go na nasz wyjątek dla celów informacyjnych
            throw new CurrencyNotFound( // Argumenty dla tego konstruktora to wiadomość błędu oraz oryginalny wyjątek, aby zachować ciągłość
                String.format("Cannot find currency: %s Available currencies: %s", // String.format podstawia nam pod %s odpowiednie zmienne
                        currencyToBuy, Currency.values()),
//                "Cannot find currency: " + currencyToBuy // Powyższe można zastąpić zwykłym sklejaniem ciągów znakowych
//                        + " Available currencies: " + Currency.values(),
                exception
            );
        }
    }
}
