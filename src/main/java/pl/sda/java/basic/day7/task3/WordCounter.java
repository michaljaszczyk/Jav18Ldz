package pl.sda.java.basic.day7.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCounter {

    private List<String> fileContent;

    public void loadFile(Path path) throws IOException {
        fileContent = Files.readAllLines(path); // wynikiem metody readAllLines jest lista linii (każdy element listy jest osobną linią z pliku)
    }

    // pierwsza wersja metody, niżej znajduje się nowa wersja z wydzieloną wspólną częścią do osobnej metody
//    public int countWords() {
//        int wordsCount = 0;
//        for (String line : fileContent) {
//            String[] words = line.split(" ");
//            wordsCount += words.length;
//        }
//        return wordsCount;
//    }

    public int countWords() {
        // wywołujemy metodę getWords, która zwraca listę wszystkich słów
        // następnie pobieram rozmiar tej listy
        return getWords().size();
    }

    // pierwsza wersja metody, niżej znajduje się nowa wersja z wydzieloną wspólną częścią do osobnej metody
//    public Set<String> uniqueWords() {
//        // przygotowujemy Set na unikalne słowa
//        Set<String> uniqueWords = new HashSet<>();
//        for (String line : fileContent) { // przchodzimy po wszystkich liniach
//            String[] words = line.split(" "); // dzielimy linie na słowa
////            for (String word : words) { // dodanie wszystkich słów w linni do Setu
////                uniqueWords.add(word);
////            }
//            List<String> listOfWords = Arrays.asList(words); // zamiana tablicy na listę
//            uniqueWords.addAll(listOfWords); // dodanie wszystkich słów z listy o Setu. Działa tak samo jak powyższy for
//        }
//
//        return uniqueWords;
//    }

    public Set<String> uniqueWords() {
        List<String> words = getWords(); // pobieramy listę wszystkich słów
        Set<String> uniqueWords = new HashSet<>(words); // tworzymy set z elementów listy "words"
        return uniqueWords;
//        return new HashSet<>(getWords()); // to samo co 3 poprzednie linie
    }

    public Map<String,Integer> countDuplicatedWords() {
        // przygotowujemy mapę wynikową
        Map<String,Integer> wordsToCount = new HashMap<>();
        // pobieramy listę wszystkich słów
        List<String> words = getWords();
        for (String word : words) { // przechodzimy po wszystkich słowach
            Integer count = wordsToCount.get(word); // pobieramy ilość wystąpień danego słowa (null jeżeli danego słowa nie było w mapie)
            if (count != null) { // jeżeli dane słowo było w mapie
                wordsToCount.replace(word, count + 1); // zmieniamy licznik wystąpienia danego słowa zwiększając go o 1
//                wordsToCount.put(word, count + 1); // to samo co wyżej
            } else {
                wordsToCount.put(word, 1); // dane słowo nie było wcześniej w mapie, więc je dodajemy wraz z wartością 1 (jest to pierwsze wystąpienie słowa)
            }
        }
        return wordsToCount;
    }

    private List<String> getWords() {
        List<String> wordsList = new ArrayList<>(); // przygotowujemy listę wynikową
        for (String line : fileContent) { // przchodzimy po wszystkich liniach
            line = line.toLowerCase(); // zamieniamy wszystkie znaki na małe
            String[] words = line.split("[ ,.:!?;()]");// dzielimy linie na słowa, dodatkowo usuwając też podane symbole
            List<String> lineWords = Arrays.asList(words); // zamieniamy tablicę na listę
            wordsList.addAll(lineWords); // dodajemy słowa dla linii do wynikowej listy
        }
//        List<String> immutableList = Collections.singletonList(""); // utworzenie niemodyfikowalnej listy jednoelementowej
//        wordsList.removeAll(immutableList); // usuwa wszystkie elementy, które występują w podanej kolekcji
        wordsList.removeAll(Arrays.asList("")); // to samo co wyżej (usuwa wszystkie puste znaki)
        return wordsList;
    }
}
