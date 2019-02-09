package pl.sda.java.basic.day4.interfacing;

public interface PrzykladInterfejsu {

    // wszystkie pola w interfejsie są zawsze "public static final", dlatego można pominąć te słowa kluczowe
    public static final int NUMBER = 5;
    double PI = 3.14;
//    private static int number2 = 5; // nie można tworzyć innych pól niż public static final

    // wszystkie metody są publiczne. Domyślnie są one abstrakcyjne (nie mają implementacji)
    void fun();
//    private void fun(); // nie można tworzyć innych metod niż publiczne

    // od Javy 8 można dodawać domyślną implementację metody dodając słowo kluczowe default
    default void fun2() {
        System.out.println("cos");
    }
}
