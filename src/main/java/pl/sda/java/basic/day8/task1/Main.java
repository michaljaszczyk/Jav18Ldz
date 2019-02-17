package pl.sda.java.basic.day8.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonManager personManager = new PersonManager();
        Path path = Paths.get("src", "main", "resources", "people.txt"); // przygotowanie ścieżki do ploku
//        Path path = Paths.get("c:", "Programowanie", "Ldz18Java", "src", "main", "resources", "people.txt"); // to samo co wyżej, tylko podajemy ścieżkę bezwzględną
        personManager.load(path); // wczytujemy plik
        List<Person> people = personManager.getPeople(); // pobieramy przetworzone osoby z pliku
        System.out.println(people);

        List<Person> people2 = PersonManager.loadPeople(path); // wywołanie metody statycznej z klasy PersonManager. Metodę statyczną wywołujemy bezpośrednio przez nazwę klasy bez tworzenia nowego obiektu danej klasy
        System.out.println(people2);
    }
}
