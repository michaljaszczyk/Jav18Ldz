package pl.sda.java.basic.day7.repetition;

public interface Predator {

    void hunt(); // metoda abstrkacyjna, musi być zaimplementowana przez klasy implementujące ten interfejs

    // metoda z domyślną implementacją
    default void kill() {
        System.out.println("Zabijam!");
    }
}
