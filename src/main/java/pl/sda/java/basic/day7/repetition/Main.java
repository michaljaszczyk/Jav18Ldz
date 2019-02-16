package pl.sda.java.basic.day7.repetition;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String someString = "Hello World";
        String anotherString = new String("Hello World"); // to samo co wyżej

        LocalDate myBirthday = LocalDate.of(2019, Month.FEBRUARY, 16); // utworzenie nowej daty podając rok, miesiąc, dzień
//        LocalDate myBirthday = LocalDate.now(); // zwróci aktualną datę
        Person person = new Person("imie", "nazwisko", myBirthday);
        LocalDate birthday = person.getBirthday();
        String name = person.getName();

//        Animal animal = new Animal(); // nie można utworzyć bo klasa jest abstrakcyjna
        Dog dog = new Dog();
        Cat cat = new Cat(5);
        cat.hunt(); // mamy dostęp do metod z interfejsu Predator
        cat.kill();
        String specie = cat.getSpecies(); // metoda z klasy bazowej

        Animal catAnimal = new Cat(3);
//        Cat someCAt = new Animal(); // nie można, ponieważ klasa Animal jest bardziej ogólna (nawet gdyby nie była abstrakcyjna)
        String catSpecie = catAnimal.getSpecies();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(catAnimal);

        if (catAnimal instanceof Predator) { // instanceof sprawdza typ obiektu. Uwaga: zamienijąc Predator na Animal lub Cat warunek też będzie spełniony, bo Cat to też Animal
            System.out.println("kot to predator");
        }

        Predator catPredator = new Cat(6);
        catPredator.hunt(); // mamy dostęp tylko do metod z interfejsu
        catPredator.kill();

        // klasa anonimowa
        Animal abstractAnimal = new Animal("some specie") {
            private int number; // możemy deklarować pola i metody tak jak w normalnej klasie

            // nie jesteśmy w stani wywołać tej metody poza obrębem klasy anonimowej
            public void fun() {
                System.out.println();
            }

            // możemy nadpisywać metody
            @Override
            public String getSpecies() {
                return "bla bla";
            }
        };
//        ((Animal) abstractAnimal).fun(); // nie ma możliwości wywołania metody fun, ponieważ klasa anonimowa nie ma nazwy, więc nie możemy użyć rzutowania
        System.out.println(abstractAnimal.getSpecies());

        // przykład klasy anonimowej w przypadku interfejsu
        Predator abstractPredator = new Predator() {
            // implementacja metody abstrakcyjnej
            @Override
            public void hunt() {
                System.out.println("anonimowe polowanie");
            }
        };
        abstractPredator.kill();
        abstractPredator.hunt();

        /////////////////
        // mapowanie łancucha znakowego na obiekt typu Cat
        Map<String,Cat> catMap = new HashMap<>();
        catMap.put("Filemon", cat); // dodanie kota pod kluczem Filemon
        catMap.put("Filemon", new Cat(9)); // poprzedni kot pod kluczem Filemon zostanie nadpisany
        Cat filemon = catMap.get("Filemon"); // null w przypadku braku danego klucza w mapie
        boolean filemonExists = catMap.containsKey("Filemon"); // sprawdza czy dany klucz istnieje w mapie

        Cat bonifacy = catMap.get("Bonifacy");
        if (bonifacy != null) { // sprawdzenie czy obiekt nie jest nullem
            bonifacy.hunt(); // bezpiecznie możemy wywoływać metody na tym obiekcie
        } else {
            System.out.println("Nie ma Bonifacego!");
        }

        // działa tak samo jak warunek wcześniej
        if (catMap.containsKey("Bonifacy")) { // sprawdzamy czy w mapie istnieje klucz Bonifacy
            catMap.get("Bonifacy").hunt(); // jeżeli wartość pod kluczem Bonifacy jest null to program zakończy się niepowodzeniem
        } else {
            System.out.println("Nie ma Bonifacego!");
        }

        catMap.putIfAbsent("Filemon", new Cat(123)); // nie doda tego klucza bo już taki istnieje w mapie
        catMap.putIfAbsent("Bonifacy", new Cat(22)); // doda nowy wpis do mapy

        catMap.replace("Bonfacy", new Cat(33)); // zadziałą, poneiważ klucz Bonifacy istnieje w mapie
        catMap.replace("Kitek", new Cat(1)); // nie zadziała, bo nie ma takiego klucza w mapie
        Cat bonifacy1 = catMap.getOrDefault("Bonifacy", new Cat(0));// zwróci wartość pod kluczem Bonifacy
        Cat klakier = catMap.getOrDefault("Klakier", new Cat(0)); // zwróci wartość, którą podaliśmy jako drugi argument do metody getOrDefault

        Collection<Cat> values = catMap.values(); // pobranie wszystkich wartości
        Set<String> keys = catMap.keySet(); // pobranie wszystkich kluczy
        Set<Map.Entry<String, Cat>> keyValue = catMap.entrySet(); // pobranie wszystkich par klucz-wartość
        for (Map.Entry<String,Cat> tempKeyValue : catMap.entrySet()) { // przejście po wszystkich parach klucz-wartość
            System.out.println(tempKeyValue);
        }
    }
}
