package pl.sda.java.basic.day4.interfacing;

// klasa może implementować wiele interfejsów
public class ImplementacjaInterfejsu implements PrzykladInterfejsu, Interfejs2 {

    // musimy zaimplementować (nadpisać) każdą metodę, która nie ma domyślnej implementacji
    @Override
    public void fun() {
        System.out.println("Hello world");
    }
}
