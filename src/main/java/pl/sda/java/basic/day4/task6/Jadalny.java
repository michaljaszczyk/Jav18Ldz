package pl.sda.java.basic.day4.task6;

// interfejs
public interface Jadalny {
    // domyślna implementacja metody
    default void zjedz() {
        System.out.println("jem grzyba");
    }
}
