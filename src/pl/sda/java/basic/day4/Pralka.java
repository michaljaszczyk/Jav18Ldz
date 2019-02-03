package pl.sda.java.basic.day4;

// przykład klasy z kilkoma cechami oraz funkcjonalnościami
public class Pralka {
    private int ladownoscWKg;
    private boolean czyWlaczona;
    private String model;

    public Pralka() {
        this.ladownoscWKg = 5;
        this.czyWlaczona = false;
        this.model = "Domyslny";
    }

    public Pralka(int ladownoscWKg, boolean czyWlaczona, String model) {
        this.ladownoscWKg = ladownoscWKg;
        this.czyWlaczona = czyWlaczona;
        this.model = model;
    }

    public void pranie() {
        System.out.println("Piore");
    }

    public void wirowanie() {
        System.out.println("Wiruje");
    }

    public void suszenie() {
        System.out.println("Suszenie");
    }
}
