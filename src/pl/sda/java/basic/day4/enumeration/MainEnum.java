package pl.sda.java.basic.day4.enumeration;

public class MainEnum {

    // pola statyczne są współdzielone przez wszystkie obiekty danej klasy, zmienijąc wartość takiego pola zmienia się ona we wszystkich utworzonych obiektach
    private static int id;
    // final osznacza, że nie można zmienić wartości danego pola
    private final int jakiesId = 5;
    // stała statyczna jest współdzielona przez wszystkie klasy więc można ją użyć zamiast powyższego pola, aby zaoszczędzić miejsce w pamięci
    private static final int JAKIES_ID2 = 5;

    // pole final nie zawsze musi być od razu przypisane. Można je też ustawić w kosntruktorze
    private final int number;

    public MainEnum(int number) {
        this.number = number; // ostateczne miejsce na przypisanie wartości do pola final. W ten spsób można ustawić wartość na postawie parametru. Przydatne jeżeli dane pole nie powinno być zmieniane wewnątrz naszej klasy
//        this.number = 3; // nie można już zmienić wartości pola final
    }

    public static void main(String[] args) {
        Color kolorMojegoSamochodu = Color.BLACK; // pobranie jednej z dostępnych wartości enuma poprzez jego nazwę
        System.out.println(kolorMojegoSamochodu.getNumber()); // wywołanie metody dostępnej w enumie
        System.out.println(Color.RED.getNumber()); // wywołanie metody dostępnej w enumie
        pomalujAuto(Color.WHITE); // przezkazanie wartości enuma do metody
        pomalujAuto(Color.getColor(3)); // przezkazanie wartości enuma do metody za pomocą metody pomocniczej wyszukującej wartość enuma na podstawie liczby
        Color black = Color.valueOf("black".toUpperCase()); // Color.valueOf pobiera element enuma po jego nazwie. Wielkość liter ma znaczenie. Metoda toUpperCase w klasie String zamienia wszystkie litery w Stringu na duże
        pomalujAuto(black);
    }

    public static void pomalujAuto(Color color) {
        System.out.println("Maluje na kolor numer:" + color.getNumber());
        System.out.println("Maluje na kolor:" + color);
    }
}
