package pl.sda.java.basic.day4.task4;

public class Main {
    public static void main(String[] args) {
        Pomieszczenie pomieszczenie = new Pomieszczenie(4.5, 0, 3);
        System.out.println(pomieszczenie.getLiczbaDrzwi());
        System.out.println(pomieszczenie.czyJestWentylowane());

        Pokoj pokoj = new Pokoj(6, 2, 1, "Biały", true);
        System.out.println(pokoj.getLiczbaDrzwi());
        System.out.println(pokoj.czyJestWentylowane());

        // Pokoj to Pomieszczenie, więc możemy przypisać go do zmiennej typu Pomieszczenie
        Pomieszczenie pokoj2 = new Pokoj(6, 2, 1, "Biały", true);
        System.out.println(pokoj2.getLiczbaDrzwi());
        System.out.println(pokoj2.czyJestWentylowane());

        // Aby 2 pokoje były sobie równe musimy nadpisać metodę equals
        if (pokoj2.equals(pokoj)) {
            System.out.println("Oba pokoje sa takie same");
        } else {
            System.out.println("Pokoje sa inne");
        }
    }
}
