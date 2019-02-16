package pl.sda.java.basic.day7.task3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

// TODO: fix failing tests
// FIXME: tests are broken
public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        Path panTadeuszPath = Paths.get("src", "main", "resources", "panTadeusz.txt");
//        Path panTadeuszPath2 = Paths.get("c:", "Programowanie", "src", "main", "resources", "panTadeusz.txt"); // to samo co wyżej ale podając ścieżkę bezwględną
//        Path panTadeuszPath3 = Paths.get("c:/Programowanie/src/main/resources/panTadeusz"); // to samo co wyżej ale podając ścieżkę z separatorami
        try {
            wordCounter.loadFile(panTadeuszPath); // wczytujemy plik z danymi
            int wordCount = wordCounter.countWords(); // pobiramy ilość słów
            System.out.println("Ilość słów to: " + wordCount);
            Set<String> uniqueWords = wordCounter.uniqueWords(); // pobieramy unikalne słowa
            System.out.println(uniqueWords.size());
            System.out.println(uniqueWords); // wyświetlenie unikalnych słów
            Map<String, Integer> duplicatedWordsCount = wordCounter.countDuplicatedWords(); // mapa słów wraz z ilością ich wystąpień
            System.out.println(duplicatedWordsCount); // wyświetlenie mapy
        } catch (IOException e) { // obsługa wyjątku
            System.out.println("Taki plik nie istnieje: " + panTadeuszPath);
        }
    }
}
