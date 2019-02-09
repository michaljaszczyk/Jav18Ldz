package pl.sda.java.basic.day4;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // tworzenie tablicy
        int[] numbers = {1,2,3};
        int[] numbers2 = new int[]{1,2,3};
        int length = numbers.length;

        // tworzenie kolekcji
        // typ kolekcji <typ przechowywany>
        List<Integer> listOfNumbers; // List to interfejs
        listOfNumbers = new ArrayList<>(); // ArrayList to implementacja List. ArrayList ma szybsze przeszukiwanie listy, ale wolne dodawanie i usuwanie lementów listy
        listOfNumbers.add(5); // dodawanie elementu. Elementy przechowywane są w kolejności dodawania
        listOfNumbers.add(5);
        listOfNumbers.add(123);
        listOfNumbers.add(5);
        listOfNumbers.add(5);
//        listOfNumbers.add("asd"); // nie można dodać innego typu niż też podany w nawiasach trójkątnych przy tworzeniu listy
        for (int number : listOfNumbers) {
            System.out.println(number); // wyświetla lement listy
        }
        System.out.println();
        System.out.println(listOfNumbers); // wyswietlanie wszystkich elementów listy
        System.out.println();

        Integer pierwszyElement = listOfNumbers.get(0); // pobranie elementu list pod indeksem 0
        int size = listOfNumbers.size(); // rozmiar listy
        ArrayList<Integer> listOfNumbers2 = new ArrayList<>(); // można deklarować pole używając implementacji (zamiast interfejsu List)
        listOfNumbers.remove(2); // usuwanie elementu pod indeksem 2
        listOfNumbers.remove(new Integer(5)); // usuwanie liczby 5 z listy
        System.out.println();
        for (int number : listOfNumbers) {
            System.out.println(number);
        }
        System.out.println();
        // usuwanie wszystkich liczb 5 z listy
        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println("indeks: " + i);
            if (listOfNumbers.get(i) == 5) { // jeżeli element list pod indeksem 'i' == 5
                listOfNumbers.remove(i);
                i--; // zmniejszamy licznik poniewaz usunelismy jeden z elementow a pozostale wchodza na jego miejsce
            }
        }

        System.out.println();
        for (int number : listOfNumbers) {
            System.out.println(number);
        }
        // sortowanie listy (zmienia kolejność elementów bezpośrednio w danej liście)
        listOfNumbers.sort(Comparator.naturalOrder()); // koljność naturalna (alfabetyczna, a w przypadku liczb od najmniejszej liczby)
        listOfNumbers.sort(Comparator.reverseOrder()); // odwrotna kolejność
        //

        List<String> words = new LinkedList<>(); // bardzo szybkie dodawanie elementów na początku i końcu listy. Bardzo szybkie usuwanie lementów wykorzystując iterator (np. words.iterator().remove();)
        words.add("aaa");
        words.add("bbb");
        words.remove(0);
        words.remove("bbb");

        // Set przechoje tylko unikalne wartości, a kolejność elementów jest nieokreślona (chyba, że konkretna implementacja to zmienia)
        // tylko unikalne elementy, największa szybkość
        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(5);
        setOfNumbers.add(3);
        setOfNumbers.add(333);
        setOfNumbers.add(3); // nie zostanie dodana bo już jest w tej kolekcji
        setOfNumbers.add(1);
        setOfNumbers.remove(5); // usuwa liczbę 5

        for (int someNumber : setOfNumbers) {
            System.out.println(someNumber);
        }
        System.out.println(setOfNumbers); // wyświetla elementy kolekcji

        // tylko unikalne elementy, posortowane
        // wymaga, aby przechowywane typy obiektów miały zaimplementowany interfejs Comparable
        TreeSet<String> setOfStrings = new TreeSet<>();
        setOfStrings.add("aaa");
        setOfStrings.add("zzz");
        setOfStrings.add("bbb");
        for (String someString : setOfStrings) {
            System.out.println(someString);
        }
        NavigableSet<String> setOfStringsReversed = setOfStrings.descendingSet(); // zwraca nowy set z elementami w odwrotnej kolejności
        System.out.println(setOfStringsReversed);

//        Set<Grzyb> grzyby = new TreeSet<>();
//        Muchomor muchomor = new Muchomor();
//        grzyby.add(muchomor); // nie uda sie bo Grzyb nie implementuje interfejsu Comparable

        // tylko unikalne elementy, przechowuje elementy w kolejności dodania
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(44);
        linkedHashSet.add(1);
        linkedHashSet.add(3); // nie zostanie dodane bo się powtarza
        for (int number : linkedHashSet) {
            System.out.println(number);
        }
    }
}
