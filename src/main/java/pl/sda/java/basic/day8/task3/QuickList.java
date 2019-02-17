package pl.sda.java.basic.day8.task3;

import java.util.Arrays;
import java.util.List;

public class QuickList<T> {

    private List<T> elements;

    public QuickList(T... elements) {
        this.elements = Arrays.asList(elements); // zamieniamy tablicę na listę
    }

    public List<T> toList() {
        return elements;
    }

    // nie możemy skorzystać z typu generycznego poprzez metody statyczne, ponieważ podany typ jest znany dopiero przy utworzeniu obiektu
//    public static List<T> list(T... elements) {
//        return Arrays.asList();
//    }
}
