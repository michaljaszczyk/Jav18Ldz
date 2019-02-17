package pl.sda.java.basic.day8.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonManager {
    private List<Person> people;

    public void load(Path path) throws IOException {
        Stream<String> lines = Files.lines(path); // przygotowujemy strumień z zawartością pliku
        people = lines.filter(line -> line.contains(";")) // akceptujemy tylko linie zawierające ";"
                .map(line -> line.split(";")) // dzielimy linie po znaku ";", w wyniku czego uzyskujemy tablicę dla każdej z linii
                .map(lineArray -> new Person(lineArray[0], lineArray[1])) // zamieniamy tablicę na obiekt typu Person
                .collect(Collectors.toList()); // zamieniamy strumień obiektów typu Person na listę
    }

    public List<Person> getPeople() {
        return people;
    }

    // to samo co wyżej, tylko stosując metodę statyczną
    public static List<Person> loadPeople(Path path) throws IOException {
        Stream<String> lines = Files.lines(path); // przygotowujemy strumień z zawartością pliku
        return lines.filter(line -> line.contains(";")) // akceptujemy tylko linie zawierające ";"
                .map(line -> line.split(";")) // dzielimy linie po znaku ";", w wyniku czego uzyskujemy tablicę dla każdej z linii
                .map(lineArray -> new Person(lineArray[0], lineArray[1])) // zamieniamy tablicę na obiekt typu Person
                .collect(Collectors.toList()); // zamieniamy strumień obiektów typu Person na listę
    }
}
