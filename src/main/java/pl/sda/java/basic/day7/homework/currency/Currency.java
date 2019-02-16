package pl.sda.java.basic.day7.homework.currency;

import java.math.BigDecimal;

/**
 * @author Michal Jaszczyk
 **/
public enum Currency {
    // Wartości w nawiasach są przekazywane do konstruktora
    PLN(BigDecimal.ONE, BigDecimal.ONE),
    USD(new BigDecimal("3.7012"), new BigDecimal("3.7192")),
    EUR(new BigDecimal("4.2672"), new BigDecimal("4.2865")),
    CHF(new BigDecimal("3.7237"), new BigDecimal("3.7428")),
    GBP(new BigDecimal("4.7464"), new BigDecimal("4.7671"));

    private BigDecimal sellRate;
    private BigDecimal buyRate;

    // W neumie konstruktor jest zawsze prywatny. Nie można stworzyć nowego obiektu enuma za pomocą słowa kluczowego new
    Currency(BigDecimal sellRate, BigDecimal buyRate) {
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public BigDecimal getBuyRate() {
        return buyRate;
    }

    public BigDecimal getSellRate() {
        return sellRate;
    }
}
