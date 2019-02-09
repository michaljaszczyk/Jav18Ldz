package pl.sda.java.basic.day3.task2;

public class Zwierze {
    private String gatunek;

    public Zwierze(String gatunek) {
        if (gatunek.equals("gad")
                || gatunek.equals("ryba")
                || gatunek.equals("ssak")
            ) {
            this.gatunek = gatunek;
        } else {
            this.gatunek = "nieznany";
        }
    }
}
