package pl.sda.java.basic.day3.task1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private char plec;

    public Osoba(String imie, String nazwisko, int wiek, char plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public char getPlec() {
        return plec;
    }
}
