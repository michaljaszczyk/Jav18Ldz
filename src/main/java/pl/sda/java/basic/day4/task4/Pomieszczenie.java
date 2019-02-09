package pl.sda.java.basic.day4.task4;

public class Pomieszczenie {
    private double powierzchniaWMetrach;
    private int liczbaOkien;
    private int liczbaDrzwi;

    public Pomieszczenie(double powierzchniaWMetrach, int liczbaOkien, int liczbaDrzwi) {
        this.powierzchniaWMetrach = powierzchniaWMetrach;
        this.liczbaOkien = liczbaOkien;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public boolean czyJestWentylowane() {
        if (liczbaOkien < 1) {
            return false;
        } else {
            return true;
        }
    }

    public void wyburz() {
        System.out.println("Wyburzam");
    }

    public double getPowierzchniaWMetrach() {
        return powierzchniaWMetrach;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }
}
