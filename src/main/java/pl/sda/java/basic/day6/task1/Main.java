package pl.sda.java.basic.day6.task1;

public class Main {
    public static void main(String[] args) {

//    1. Wypisz wszystkie liczby z zakresu 20 do 123.
//        for (int i = 20; i < 124; i = i + 1) { // to samo co niżej
        for (int i = 20; i <= 123; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//    2. Wypisz wszystkie liczby z zakresu -40 do 15.
        for (int i = -40; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//    3. Wypisz wszystkie liczby z zakresu 1 do 100 w kolejności od największej do najmniejszej
        for (int i = 100; i >= 1; i--) {
            System.out.println(i + " ");
        }
        System.out.println();
//    4. Wypisz wszystkie liczby parzyste z przedziału 0 do 100.
//        for (int i = 0; i <= 100; i += 2) {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i + " "); // wyświetlamy co drugą liczbę
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " "); // wyświetlamy liczby parzyste
            }
        }
        System.out.println();
//    5. Dla liczb z przedziału 0 do 100 podaj informację, czy są podzielne przez 2, 3 i 5,
//        w następujący sposób:
//        0, podzielne przez: 2, 3, 5
//        1
//        2, podzielne przez: 2
//        3, podzielne przez: 3
//        4, podzielne przez: 2
//        5, podzielne przez: 5
//        6, podzielne przez: 2, 3
//        7
//        8, podzielne przez: 2
//        9, podzielne przez: 3
//        10, podzielne przez: 2, 5
        for (int i = 0; i <= 100; i++) {
            System.out.print(i); // drukujemy aktualną wartość licznika
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                System.out.print(", podzielne przez: "); // jeżeli licznik jest podzielny przez 2,3 lub 5 to wydrukuj napis
                if (i % 2 == 0) { // sprawdzenie czy podzielne przez 2
                    System.out.print("2");
                }
                if (i % 3 == 0) { // sprawdzenie czy podzielne przez 3
                    if (i % 2 == 0) { // jeżeli też podzielne przez 2 to dodajmy najpierw przecinek
                        System.out.print(", ");
                    }
                    System.out.print(3);
                }
                if (i % 5 == 0) { // sprawdzenie czy podzielne przez 5
                    if (i % 2 == 0 || i % 3 == 0) { // jeżeli też podzielne przez 2 lub 3 to dodajmy najpierw przecinek
                        System.out.print(", ");
                    }
                    System.out.print(5);
                }
            }
            System.out.println();
        }

        // to samo działanie co wyżej
        for (int i = 0; i <= 100; i++) {
            System.out.print(i);
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                System.out.print(", podzielne przez: ");
                boolean isDividable = false;
                if (i % 2 == 0) {
                    System.out.print("2");
                    isDividable = true;
                }
                if (i % 3 == 0) {
                    if (isDividable) {
                        System.out.print(", ");
                    }
                    System.out.print(3);
                    isDividable = true;
                }
                if (i % 5 == 0) {
                    if (isDividable) {
                        System.out.print(", ");
                    }
                    System.out.print(5);
                }
            }
            System.out.println();
        }

    }
}
