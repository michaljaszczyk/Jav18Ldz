package pl.sda.java.basic.day4.enumeration;

// typ wyliczeniowy
public enum Color {
    // RED, WHITE, BLACK to obiekty typu Color. Dostęp do nich jest poprzez nazwę enuma. Np. Color.WHITE
    // Wartości w nawiasach to argumenty przekazane do konstruktora. W przypadku braku konstruktora nie dodajemy nawiasów
    RED(3),
    WHITE(123),
    BLACK(888); // średnik za ostatnim elementem

    // możemy definiować własne pola
    private int number;

    // konstruktor w enumie zawsze jest prywatny, słowo private można pominąć
    private Color(int number) {
        this.number = number;
    }

    // możemy definiować własne metody
    public int getNumber() {
        return number;
    }

    // przykład metody, która zwróci odpowiedni obiekt typu Color na podstawie przypisanego do neigo numeru
    public static Color getColor(int number) {
        for (Color color : Color.values()) { // pętla po wszystkich elementach enuma Color
            if (color.number == number) {
//            if (color.getNumber() == number) { // to samo co linijka wyżej
                return color; // jeżeli liczba się zgadza to zwracamy znaleziony obiekt
            }
        }
        return null; // jeżeli żaden obiekt typu Color nie posiada podanej liczby to możemy np. zwrócić null lub jedną z dostępnych wartości
    }
}
