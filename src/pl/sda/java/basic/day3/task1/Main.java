package pl.sda.java.basic.day3.task1;

public class Main {
    public static void main(String[] args) {
        Osoba michalJaszczyk = new Osoba("Michał", "Jaszczyk", 18, 'M');
        Indeks indeksMichalaJaszczyka = new Indeks(michalJaszczyk);
        int[] oceny = new int[]{5, 4, 6, 3, 3, 5};
        indeksMichalaJaszczyka.setOceny(oceny);
        double srednia = indeksMichalaJaszczyka.obliczSrednia();
        System.out.println(srednia);

        System.out.println(indeksMichalaJaszczyka.isZagrozony());
    }
}
