package pl.sda.java.basic.day8.optionals;


import pl.sda.java.basic.day8.task1.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person michalJaszczyk = new Person("Michał", "Jaszczyk");
        Person nullPerson = null;

//        nullPerson.getName(); // aplikacja się wywali
        if (nullPerson != null) {
            System.out.println(nullPerson.getName()); // jesteśmy bezpieczni
        }

        Optional<Person> optionalPerson = Optional.ofNullable(nullPerson); // opakowanie obiektu Person w optional
//        Optional.of(nullPerson); // metoda of nie wspiera wartości null
//        Person person = optionalPerson.get(); // próba pobrania wartości, która jest nullem zakończy się błędem
        Person person1 = optionalPerson.orElse(new Person("Domyślna", "Osoba")); // zwraca domyślną wartość jeżeli optional przechwuje null
        System.out.println(person1.getName());

        List<String> hello = methodThatReturnOptional() // metoda zwraca optional
                .map(sentence -> sentence.split(" ")) // bierzemy wartość opakowaną przez optional (String) i robimy split, w wyniku czego otrzymujemy tablicę Stringów
                .map(wordsArray -> Arrays.asList(wordsArray)) // zamieniamy tablicę na listę
                .filter(wordsList -> wordsList.contains("Cat")) // akceptujemy tą listę tylko jeżeli, którykolwiek z jej elementów to "Cat"
//                .get(); // ostrożnie! jeżeli nie ma tutaj żadnego lementu, to dostaniemy wyjątek
                .orElse(new ArrayList<>());
        System.out.println(hello);

        List<String> hello2 = methodThatReturnOptional() // metoda zwraca optional
                .map(sentence -> sentence.split(" ")) // bierzemy wartość opakowaną przez optional (String) i robimy split, w wyniku czego otrzymujemy tablicę Stringów
                .map(wordsArray -> Arrays.asList(wordsArray)) // zamieniamy tablicę na listę
                .map(wordsList -> wordsList.stream() // listę ze słowami zamieniamy na strumień
                                .filter(listElement -> listElement.contains("ello")) // akcpetujemy tylko te słowa, które zawierają "Cat"
                                .collect(Collectors.toList()) // zamieniamy strumień spowrotem na listę
                )
//                .get(); // ostrożnie! jeżeli nie ma tutaj żadnego lementu, to dostaniemy wyjątek
                .orElse(new ArrayList<>());
        System.out.println(hello2);

//        Optional.of(null); // niedopuszczalne, ta metoda nie akceptuje wartości null
        Optional.ofNullable(null); // ta metoda akceptuje wartości null
    }

    public static Optional<String> methodThatReturnOptional() {
        return Optional.ofNullable("Hello World!");
    }
}
