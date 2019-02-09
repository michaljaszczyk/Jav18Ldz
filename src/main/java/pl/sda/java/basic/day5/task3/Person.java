package pl.sda.java.basic.day5.task3;

import java.util.Objects;

// implementacja interfejsu Comparable pozwala sortować obiekty danej klasy w kolekacjach
public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // compareTo powinno zwrócić liczbę ujemną jeżeli nasz obiekt jest wcześniej (mniejszy) niż ten podany w argumencie, w odwrotnej sutyacji powinniśmy zwrócić liczbę dodatnią. Jeżeli oba obiekty są takie same to zwróćmy zero
    @Override
    public int compareTo(Person otherPerson) {
//        int compare = surname.compareTo(otherPerson.surname); // sprawdzamy, które nazwisko jest bliżej według alfabetu
//        int compare = surname.toLowerCase().compareTo(otherPerson.surname.toLowerCase()); // to samo co wyżej tylko ignorujemy wielkości liter
        int compare = surname.compareToIgnoreCase(otherPerson.surname); // to samo co linijka wyżej
        if (compare == 0) { // jeżeli nazwiska są takie same
            return name.compareTo(otherPerson.name); // porównujemy imiona
        } else {
            return compare;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // napisanie metod equals i hashcode jest wymagane w przypadku korzystania z HashSet i HashMap (jeżeli ta klasa jest kluczem)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }
}
