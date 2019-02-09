package pl.sda.java.basic.day4.abstractclass;

// dodajemy słowo kluczowe abstract
public abstract class PrzykladKlasyAbstrakcyjnej {

    // mamy dostępne wszystkie funkcjonalności zwykłej klasy

    // pola statyczne są współdzielone przez wszystkie obiekty danej klasy, zmienijąc wartość takiego pola zmienia się ona we wszystkich utworzonych obiektach
    public static int maxId = 0;
    // pole prywatne jest widoczne tylko wewnątrz danej klasy
    private int poleKlasy;
    // pole publiczne jest widoczne dla dowolnej klasy
    public int poleKlasy2;
    // pole protected jest dostępne dla klas dziedziczących lub znajdujących się w tym samym pakiecie (folderze)
    protected int poleKlasy3;
    // brak modyfikatora oznacza widoczność 'package-private', czyli pole jest dostępne dla wszystkich klas w tym samym pakiecie
    int poleKlasy4;
    private int id;

    public PrzykladKlasyAbstrakcyjnej() {
        // przykład użycia pola statycznego do przypisywania unikalnego id. Po przypisaniu, pole maxId zostaje zwiększone o 1. Utworzenie kolejnego obiektu spowoduje pobranie zwiększonej wartości maxId
        this.id = maxId++;
        double pi = Math.PI; // przykład użycia stałej statycznej to np. wartość PI w klasie Math
    }

    // możemy tworzyć dowolne metody, tak jak w zwykłej klasie
    public void fun() {
    }
    private void fun2() {
    }
    protected void fun3() {
    }
    void fun4() {
        System.out.println();
    }

    // dodatkowo możemy tworzyć metody abstrakcyjne, czyli bez implementacji. Dodajemy słowo kluczowe abstract a zamiast klamer dajemy średnik
    public abstract int fun5();
}
