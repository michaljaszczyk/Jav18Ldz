package pl.sda.java.basic.day8.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        LambdaExample lambdaExample = new LambdaExample();
        Integer powerResult = lambdaExample.power().apply(5); // metoda apply wykonuje daną lambdę
        System.out.println(powerResult);

        Integer sum = lambdaExample.add().apply(3, 5);
        System.out.println(sum);

        ///////////////
        Path path = Paths.get("src", "main", "resources", "panTadeusz.txt");

        Stream<String> lines = Files.lines(path); // przygotowanie strumienia do wczytywania
        List<String> parsedLines = lines.filter(line -> line.contains(".")) // "filtrowanie" akceptujemy tylko linie zawierające kropkę
                .filter(alamakota -> alamakota.contains("a")) // "filtrowanie", akceptujemy tylko linie, które zawirają literę "a"
                .map(line -> line.toLowerCase()) // "mapowanie", zamieniamy wszystkie litery w linii na małe
                .collect(Collectors.toList()); // zapisujemy wszystkie zaakceptowane linie ze strumienia do listy

        System.out.println(parsedLines);
        System.out.println();

        List<String> parsedLinesFromList = new ArrayList<>(); // przygotowujemy wynikową listę (z przetworzonymi liniami)
        List<String> linesList = Files.readAllLines(path); // wczytanie z pliku
        for (String line : linesList) { // przejście po wszystkich liniach
            if (line.contains(".") && line.contains("a")) { // "filtrowanie", bierzemy tylko linie które zwierją "." i literę "a"
                line = line.toLowerCase(); // "mapowanie", zamieniamy wszystkie litery w linii na małe
                parsedLinesFromList.add(line); // dodawanie przetworznej linii do wynikowej listy
            }
        }
        System.out.println(parsedLinesFromList);


        List<String> words = new ArrayList<>();
        words.add("Ala ma kota");
        words.add("Hello World!");
        words.add("Dzisiaj jest niedziela");

        List<String> result = words.stream() // zamiana listy na strumień
                .filter(word -> word.contains("!")) // bierzemy tylko linie z "!"
                .map(word -> word.split(" ")) // dzielimy linie na słowa, po wykonaniu tej instrukcji będziemy mieli tablicę Stringów
                .map(wordArray -> Arrays.asList(wordArray)) // zamieniamy tablicę Stringów na Listę stringów
                .flatMap(list -> list.stream()) // zamienia listę spowrotem na strumień, dzięki czemu przetwarzamy pojedyncze słowa zamiast listy słów
                .collect(Collectors.toList()); // zamieniamy strumień na listę
        System.out.println(result);

        /////

        System.out.println();
        Map<String,Integer> wordsToCount = new HashMap<>();
        wordsToCount.put("A", 1);
        wordsToCount.put("B", 10);
        wordsToCount.put("C", 1);
        wordsToCount.put("D", 15);
        System.out.println(wordsToCount);
        // nie zadziałą, ponieważ nie możemy usuwać elementó w tradycyjnej pętli for
//        for (Map.Entry<String,Integer> keyValue : wordsToCount.entrySet()) {
//            if (keyValue.getValue() == 1) {
//                wordsToCount.remove(keyValue.getKey());
//            }
//        }
//        System.out.println();
//        System.out.println(wordsToCount);

        // Set <klucz-wartość, gdzie klucz to String, a wartość to Integer>
        Set<Map.Entry<String, Integer>> entrySet = wordsToCount.entrySet(); // pobieramy wszystkie pary klucz-wartość z mapy
        // iterator jest najczęściej używany, jeżeli potrzebujemy usuwać elementy w trakcie przechodzenia po wszystkich elementach danej kolekcji
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator(); // pobranie iteratora kolekcji, iterator umożliwia usuwanie elementów podczas przechodzenia po elementach danej kolekcji
        while (iterator.hasNext()) { // pętla while będzie wykonywana dopóki istnieje kolejny element w tej kolekcji
            Map.Entry<String, Integer> nextKeyValue = iterator.next();
            if (nextKeyValue.getValue() == 1) {
                iterator.remove(); // usuwa aktualny element, na któy wskazuje iterator z kolekcji
            }
        }
        System.out.println();
        System.out.println(wordsToCount);

        wordsToCount.entrySet()
                .removeIf(keyValue -> keyValue.getValue() == 1); // to samo co wyżej, używając funkcjonalności z Javy 8

        wordsToCount.forEach((key, value) -> System.out.println(key + " : " + value)); // pętle for można zastąpić metodą forEach
        new ArrayList<>().forEach(something -> System.out.println(something));
        new HashSet<>().forEach(asd -> System.out.println(asd));

        // lambdy, które zwracają wynik (można je traktować analogicznie do metod, które coś zwracają)
        Function<String,String> lambdaForOneParameterAndOneResult;
        BiFunction<String,String,String> lambdaForTwoPrametersAndOneResult;

        // lambdy, które nie zwracają wyniku (można je traktować jak metody void)
        Consumer<String> lambdaForOneParameterAndNoResult;
        BiConsumer<String,String> lambdaForTwoParametersAndNoResult;
    }
}
