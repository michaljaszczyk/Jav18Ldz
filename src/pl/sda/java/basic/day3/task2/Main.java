package pl.sda.java.basic.day3.task2;

public class Main {
    public static void main(String[] args) {
        Sznaucer sznaucer = new Sznaucer();
        Labrador labrador = new Labrador();
        Dalmatynczyk dalmatynczyk = new Dalmatynczyk();
        Pies pies = new Pies("Kundel");
        // Sznaucer, Labrador i Dalmatynczyk to Psy (dziedziczą po klasie Pies), więc jest to dopuszczalne
        Pies piesSznaucer = new Sznaucer();
        Pies piesLabrador = new Labrador();
        Pies piesDalmatynczyk = new Dalmatynczyk();

        Pies[] psy = new Pies[]{sznaucer, labrador, dalmatynczyk, pies, piesSznaucer, piesLabrador, piesDalmatynczyk};
        for (Pies tymczasowyPies : psy) {
            System.out.println(tymczasowyPies.getRasa() + " " + tymczasowyPies.szczekaj());
        }

        Zwierze[] zwierzeta = new Zwierze[]{sznaucer, labrador, dalmatynczyk, pies};
        for (Zwierze zwierze : zwierzeta) {
            System.out.println(((Pies)zwierze).szczekaj()); // Ostrożnie! Program zakończy się wyjątkiem jeżeli w tablicy będzie obiekt innego typu niż Pies
        }
    }
}
