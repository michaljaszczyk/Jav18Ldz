package pl.sda.java.basic.day5.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person marcinZebra = new Person("Marcin", "Zebra");
        Person adamZebra = new Person("Adam", "Zebra");
        Person wojtekBanan = new Person("Wojtek", "Banan");
        Person waldekBaranowski = new Person("Waldek", "Baranowski");
        Person antoniArbuz = new Person("Antoni", "Arbuz");
        Person aldonaAmbroziak = new Person("aldona", "ambroziak");

        ArrayList<Person> people = new ArrayList<>();
        people.add(marcinZebra);
        people.add(wojtekBanan);
        people.add(adamZebra);
        people.add(waldekBaranowski);
        people.add(antoniArbuz);
        people.add(aldonaAmbroziak);

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        people.sort(Comparator.naturalOrder());
        for (Person person : people) {
            System.out.println(person); // kolekcja po posrtowaniu
        }
        System.out.println();

        //////////////////////

        LinkedList<String> linkedList = new LinkedList<>(); // działa szybciej przy dodawaniu elementów (na początku i na końcu)
        linkedList.add("aaa");
        linkedList.add("aaa2");
        linkedList.add(1, "cccc"); // niedopowiednie dla LinkedList z uwagi na wydajność
        linkedList.get(1); // dużo wolniejsze niż w ArrayList
        linkedList.addFirst("xxx"); // bardzo szybkie
        linkedList.addLast("xxx"); // bardzo szybkie
        linkedList.getFirst(); // bardzo szybkie
        linkedList.getLast(); // bardzo szybkie

        ///////////

        Set<Integer> numbers = new HashSet<>(); // Set przechowuje tylko unikalne wartości
        numbers.add(6);
        numbers.add(3);
        numbers.add(3); // nie zostanie dodane

        System.out.println();
        Person michal = new Person("Michał", "Jaszczyk");
        Person michal2 = new Person("Michał", "Jaszczyk");
        HashSet<Person> peopleSet = new HashSet<>();
        peopleSet.add(michal);
        peopleSet.add(michal2); // jeżeli nie zdefiniujemy metod equals i hashcode będziemy mieć oba obiekty w tej kolekcji
        System.out.println(peopleSet);
        ////
        TreeSet<Integer> treeSet = new TreeSet<>(); // automatycznie sortuje dodawane elementy
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.add(9);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);

        TreeSet<Person> peopleTreeSet = new TreeSet<>(); // przechowywana klasa musi mieć zaimplementowany interfejs comparable
        peopleTreeSet.add(marcinZebra);
        System.out.println(peopleTreeSet);
        peopleTreeSet.add(adamZebra);
        System.out.println(peopleTreeSet);
        peopleTreeSet.add(aldonaAmbroziak);
        System.out.println(peopleTreeSet);

        System.out.println();
        LinkedHashSet<Person> peopleLinkedHashSet = new LinkedHashSet<>(); // zachowuje kolejność dodawanych elementów
        peopleLinkedHashSet.add(marcinZebra);
        System.out.println(peopleLinkedHashSet);
        peopleLinkedHashSet.add(adamZebra);
        System.out.println(peopleLinkedHashSet);
        peopleLinkedHashSet.add(aldonaAmbroziak);
        System.out.println(peopleLinkedHashSet);

        /////
        System.out.println();
        // Map<typ klucza, typ wartości>
        Map<Integer,Person> personMap = new HashMap<>(); // mapuje klucz na wartość
        Person thisWillBeNull = personMap.put(5, new Person("A", "B")); // put umieszcza obiekt Person pod kluczem 5 i zwraca poprzednią wartość pod tym kluczem
        System.out.println(personMap);
        personMap.put(120, new Person("A", "B"));
        System.out.println(personMap);
        Person thisIsPersonAB = personMap.put(5, new Person("Z", "Z")); // wartość pod kluczem 5 zostanie nadpisana
        System.out.println(personMap);

        Person personZZ = personMap.putIfAbsent(5, new Person("P", "P")); // ta wartość nie zotanie dodana bo klucz 5 istnije w mapie
        Person nonExistingPersonNull = personMap.putIfAbsent(50, new Person("P", "P")); // ta wartość zostanie dodana bo klucz 50 nie istnieje w mapie

        Person personZZForKey5 = personMap.get(5); // pobranie wartości pod kluczem 5
        Person nonExistingPersonNull2 = personMap.get(55); // zwróci null bo nie ma klucza 55 w mapie

        if (personMap.containsKey(55)) { // sprawdza czy taki klucz istnijee w mpaie
            Person nonNullValue = personMap.get(55); // w większości przypadków nie zwróci null, chyba, że ktoś umieści wartość null pod podanym kluczem
        }
        personMap.put(123, null); // unikajmy tego, ponieważ utrudni nam to życie

        Person thisPersonCanBeNull = personMap.get(55);
        if (thisPersonCanBeNull != null) { // dzięki temu sprawdzeniu mamy pewność, że zmienna nie jest nullem
            thisPersonCanBeNull.getName(); // thisPersonCanBeNull nigdy nie będzie nullem
        }

        // wypisanie wszystkich par klucz-wartość mapy
        for (Map.Entry<Integer,Person> keyValue : personMap.entrySet()) {
            System.out.println("" + keyValue.getKey() + keyValue.getValue());
        }

        // wypisanie wszystkich kluczy w mapie
        for (Integer key : personMap.keySet()) {
            System.out.println(key);
            Person person = personMap.get(key); // mając klucz w łatwy posób też możemy pobrać wartość
        }

        // wypisanie wszystkich wartości w mapie
        for (Person person : personMap.values()) {
            System.out.println(person);
        }
        Person personThatWasUnderKey5 = personMap.replace(5, new Person("T", "T")); // zadziała tylko jeżeli podany klucz istnije w mapie
        Person nonExistingPersonNull3 = personMap.replace(999, new Person("T", "T"));


        TreeMap<Integer,Person> treeMap = new TreeMap<>(); // mapa z automatycznie posortowanymi kluczami
        treeMap.put(5, new Person("R", "R"));
    }
}
