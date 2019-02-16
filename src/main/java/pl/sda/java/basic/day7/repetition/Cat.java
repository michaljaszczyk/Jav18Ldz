package pl.sda.java.basic.day7.repetition;

public class Cat extends Animal implements Predator {
    // dodatkowa cecha kota
    private int mustacheLength;

    public Cat(int mustacheLength) {
        super("ssak"); // wywołanie konstruktora klasy bazowej
        this.mustacheLength = mustacheLength;
    }

    public int getMustacheLength() {
        return mustacheLength;
    }

    // implementacja metody abstrakcyjnej z interfejsu
    @Override
    public void hunt() {
        System.out.println("Poluję jak kot");
    }

    // nadpisanie domyślnej implementacji
    @Override
    public void kill() {
        System.out.println("Zabijam jak kot");
    }

    // nadpisanie metody toString w celu wyświetlania w czytelny sposób na konsoli
    @Override
    public String toString() {
        return "Cat{" +
                "mustacheLength=" + mustacheLength +
                '}';
    }
}
