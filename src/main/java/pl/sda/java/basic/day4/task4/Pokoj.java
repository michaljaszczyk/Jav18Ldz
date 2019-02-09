package pl.sda.java.basic.day4.task4;

import java.util.Objects;

public class Pokoj extends Pomieszczenie {

    // roszszerzenie cech
    private String kolorScian;
    private boolean saFiranki;

    public Pokoj(
            double powierzchniaWMetrach,
            int liczbaOkien,
            int liczbaDrzwi,
            String kolorScian,
            boolean saFiranki
    ) {
        super(powierzchniaWMetrach, liczbaOkien, liczbaDrzwi);
        this.kolorScian = kolorScian;
        this.saFiranki = saFiranki;
    }

    public String getKolorScian() {
        return kolorScian;
    }

    public boolean saFiranki() {
        return saFiranki;
    }

    // nadpisanie metody equals w celu porównywaniu obiektów typu Pokoj po wartości ich pól
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokoj pokoj = (Pokoj) o;
        return saFiranki == pokoj.saFiranki &&
                Objects.equals(kolorScian, pokoj.kolorScian);
    }

    // Niewskazane: możemy zrobić nową funkcję do porównywania, ale będzie ona dostępna tylko w klasie Pokoj
    public boolean equals2(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokoj pokoj = (Pokoj) o;
        return saFiranki == pokoj.saFiranki &&
                Objects.equals(kolorScian, pokoj.kolorScian);
    }

    // nadpisując metodę equals musimy też nadpisać metodę hashCode. Są one ze sobą powiązane.
    // Jeżeli metody equals zwraca prawdę dla 2 porównywanych obiektów to wartość hashCode musi być taka sama
    // Jeżeli hashCode dwóch obiektów jest taki sam to metoda equals nie zawsze musi zwrócić prawdę
    @Override
    public int hashCode() {
        return Objects.hash(kolorScian, saFiranki);
    }
}
