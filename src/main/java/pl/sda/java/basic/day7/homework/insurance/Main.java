package pl.sda.java.basic.day7.homework.insurance;

import java.time.LocalDate;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        Insurer insurer = new Insurer();

        Person adamKowalski = new Person("Adam", "Kowalski", LocalDate.of(1970, 1, 1));
        Person abelardNowak = new Person("Abelard", "Nowak", LocalDate.of(1972, 11, 10));
        Person adamIksinski = new Person("Adam", "Iksinski", LocalDate.of(2018, 2, 28));
        // Dodawany pesel powinien być liczbą oraz zawierać 11 cyfr. Może zaczynać się od 0
        System.out.println(insurer.addPerson("1", adamKowalski)); // za krotki pesel
        System.out.println(insurer.addPerson("1", adamKowalski)); // za krotki pesel
        System.out.println(insurer.addPerson("-1234567890", abelardNowak)); // niedopuszczalny znak w peselu
        System.out.println(insurer.addPerson("+1234567890", adamIksinski)); // niedopuszczalny znak w peselu
        System.out.println(insurer.addPerson("01234567890", adamIksinski)); // poprawne

        System.out.println(insurer.findPerson("01234567890")); // powinno znaleźć Adama Iksinskiego
        System.out.println(insurer.findPerson("2")); // brak osoby o podanym numerze pesel, więc wynik to null

        System.out.println(insurer.updatePerson("01234567890", abelardNowak)); // zmiana danych dla podanego peselu
        System.out.println(insurer.updatePerson("2", abelardNowak)); // nieudana zmiana danych, ponieważ pod podanym pselem nie ma osoby

        System.out.println(insurer.findPerson("01234567890")); // po aktualizacji zwraca Abelarda Nowaka

    }
}
