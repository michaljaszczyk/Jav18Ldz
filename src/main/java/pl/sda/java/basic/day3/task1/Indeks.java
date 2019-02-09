package pl.sda.java.basic.day3.task1;

public class Indeks {
    private double sredniaOcen;
    private Osoba daneOsobowe;
    private int[] oceny;

    public Indeks(Osoba daneOsobowe) {
        this.daneOsobowe = daneOsobowe;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public boolean isZagrozony() {
        for (int ocena : oceny) {
            if (ocena == 2 || ocena == 1) {
                return true;
            }
        }
        return false;
    }

    public Osoba getDaneOsobowe() {
        return daneOsobowe;
    }

    public int[] getOceny() {
        return oceny;
    }

    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }

    public double obliczSrednia() {
        double suma = 0; // deklarujemy jako double, aby wynik dzielnia był liczbą zmiennoprzecinkową. Zamiast tego moglibyśmy też użyć rzutowania
        for (int i = 0; i < oceny.length; i++) {
            suma = suma + oceny[i];
        }
        return suma / oceny.length;
    }
}
