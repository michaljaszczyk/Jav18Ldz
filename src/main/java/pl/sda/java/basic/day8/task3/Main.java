package pl.sda.java.basic.day8.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // utowrzenie nowego obiektu klasy QuickList, który przyjmuje liczby całkowite
        QuickList<Integer> integerQuickList = new QuickList<>(5, 3, 2, 9, 0);
        List<Integer> numbers = integerQuickList.toList(); // pobieramy listę wcześniej przekazanych elementów
        System.out.println(numbers);
        // skrócony zapis linijek powyżej
        System.out.println(new QuickList<>(6,33,222, 5).toList());
    }
}
