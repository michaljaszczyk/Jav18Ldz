package pl.sda.java.basic.day8.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NumberMapping {
    // deklaracja mapy liczb na słowa
    private Map<Integer, String> numberToWord = new HashMap<>();

    public void add(Integer number, String word) {
        numberToWord.put(number, word); // dodajemy nowy wpis do mapy
    }

    public Optional<String> get(Integer key) {
        String word = numberToWord.get(key); // pobieramy wartość z mapy
        return Optional.ofNullable(word); // opakowujemy pobraną wartość w optional
    }
}
