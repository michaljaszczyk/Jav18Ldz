package pl.sda.java.basic.day8.generics;

// ograniczamy dostępne typy tylko do tych, które dziedziczą po klasie Number
public class MoreRestrictiveGenericClass<T extends Number> {

    public double add(T a, T b) {
        // mamy dostęp do wszystkich metod z klasy Number
        return a.doubleValue() + b.doubleValue();
    }
}
