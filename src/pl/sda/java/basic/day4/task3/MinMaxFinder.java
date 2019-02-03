package pl.sda.java.basic.day4.task3;

public class MinMaxFinder {
    private int[] numbers;

    public MinMaxFinder(int[] numbers) {
        this.numbers = numbers;
    }

    public void printTwoSmallestTwoLargest() {
        if (numbers.length < 2) {
            System.out.println("Tablica liczb musi miec conajmniej 2 elementy");
        } else {
            int min1 = numbers[0]; // wypełniamy zmienne początkowymi wartościami
            int min2 = numbers[1]; // bierzemy drugą z kolei liczbę dla uproszczenia, aby nie trzeba było sprawdzać indeksów
            int max1 = numbers[0];
            int max2 = numbers[1];
            // zaczynamy od drugiego elementu, bo pierwszy jest już zapisany do zmiennych powyżej
            for (int i = 1; i < numbers.length; i++) {
                if (min1 > numbers[i]) { // sprawdzamy czy aktualna liczba jest mniejsza od min1
                    min2 = min1; //zapisujemy wartość dotychczasowej najmniejszej liczby do min2
                    min1 = numbers[i]; // aktualną najmniejszą zapisujemy do min1
                } else if (min2 > numbers[i]) { // sprawdzamy czy aktualna liczba jest mniejsza od min2
                    min2 = numbers[i]; // jeżeli tak, to zapisujemy jej wartość
                }
                if (max1 < numbers[i]) {
                    max2 = max1;
                    max1 = numbers[i];
                } else if (max2 < numbers[i]) {
                    max2 = numbers[i];
                }
            }
            System.out.println("Najmniesza wartosc: " + min1);
            System.out.println("Druga najmniesza wartosc: " + min2);
            System.out.println("Najwieksza wartosc: " + max1);
            System.out.println("Druga najwieksza wartosc: " + max2);
        }
    }
}
