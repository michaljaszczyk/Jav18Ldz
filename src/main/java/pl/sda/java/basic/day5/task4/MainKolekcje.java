package pl.sda.java.basic.day5.task4;

import java.util.*;

public class MainKolekcje {
    public static void main(String[] args) {
//        int[] numbers = {31, 12, 5, 7, -3, 123, 6, 0}; // skrócona forma linii poniżej
        Integer[] numbers = new Integer[]{31, 12, 5, 7, -3, 123, 6, 0}; // typ Integer jest wymagany do metody sort(tablica, komparator)
        System.out.println(Arrays.toString(numbers)); // łatwe wyświetlenie tablicy
        Arrays.sort(numbers); // sortowanie tablicy
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder()); // sortowanie od największej do najmniejszej
        System.out.println(Arrays.toString(numbers));

        // 5 - 10
        System.out.println();
//        List<String> words = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        words.add("kot");
        words.add("pies");
        words.add("bocian");
        words.add("aligator");
        System.out.println(words);
        Collections.reverse(words); // odwrócenie kolejności
        System.out.println(words);
//        Collections.sort(words); // efekt ten sam co linia poniżej
        words.sort(Comparator.naturalOrder()); // sortowanie aflabetycznie
        System.out.println(words);
//        Random random = new Random(5); // losuje zawsze w ten sam sposób
        Collections.shuffle(words); // wymieszanie elementów tablicy
//        Collections.shuffle(words, random); // możliwość przekazania obiektu Random ze specyficznym algorytmem losującym
        System.out.println(words);
        words.sort(Comparator.reverseOrder()); // posortowanie w odwrotnej kolejności
        System.out.println(words);

        // 11 - 13
//        Set<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);
        treeSet.add(50);
        System.out.println(treeSet);
        treeSet.add(12);
        System.out.println(treeSet);
        treeSet.add(1);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);
        treeSet.add(100);
        System.out.println(treeSet);
        treeSet.add(12);
        System.out.println(treeSet);
        treeSet.add(0);
        System.out.println(treeSet);

        // 14 - 19
//        Map<Integer,String> mapNumberToWord = new HashMap<>();
        HashMap<Integer,String> mapNumberToWord = new HashMap<>();
        mapNumberToWord.put(5, "pięć");
        mapNumberToWord.put(3, "trzy");
        mapNumberToWord.put(1, "jeden");
        mapNumberToWord.put(0, "zero");

        System.out.println(mapNumberToWord.get(1)); // zwróci łańcuch znakowy pod kluczem 1
        System.out.println(mapNumberToWord.keySet()); // zwróci wszystkie klucze
        System.out.println(mapNumberToWord.values()); // zwróci wszystkie wartości
        System.out.println(mapNumberToWord.entrySet()); // zwróci wszystkie pary klucz-wartość
    }
}
