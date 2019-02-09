package pl.sda.java.basic.day3.classes;

public class Main2 {
    public static void main(String[] args) {
        // Utworzenie nowego obiektu klasy Person
        Person michalJaszczyk = new Person("Michał", "Jaszczyk", 18);
        System.out.println(michalJaszczyk); // Nieczytelne z uwagi na domyślną implementację toString
        System.out.println(michalJaszczyk.getFirstName()); // Wyśiwetlenie kolejnych składowych klasy za pomocą getterów
        System.out.println(michalJaszczyk.getSurname());
        System.out.println(michalJaszczyk.getAge());

        michalJaszczyk.setAge(19); // modyfikowanie wartości zmiennej w obiekcie za pomocą settera
        System.out.println(michalJaszczyk.getAge());

        // Utworzenie nowego obiektu klasy Person. Oba obiekty są od siebie niezależne
        Person adamKowalski = new Person("Adam", "Kowalski", 20);
        System.out.println(adamKowalski.getFirstName());
        System.out.println(adamKowalski.getSurname());
        System.out.println(adamKowalski.getAge());
        michalJaszczyk.setAge(18); // zmiana wieku w obiekcie  michalJaszczyk nie wpływa na wiek adamKowalski
        System.out.println(adamKowalski.getAge());

        Cake applePie = new Cake(4, 2, 12);
        System.out.println(applePie.isTasty()); // różne zachowanie metody w przypadku różnych parametrów konfiguracyjnych
        Cake tastyApplePie = new Cake(2, 4, 12);
        System.out.println(tastyApplePie.isTasty());
        Cake superTastyApplePie = new Cake(2, 4, 10);
        System.out.println(superTastyApplePie.isTasty());

        Dog reksio = new Dog("Reksio", "Kundel", 'M');
        System.out.println(reksio); // Czytelne wyświetlenie dzięki nadpisaniu metody toString w klasie Dog
    }
}
