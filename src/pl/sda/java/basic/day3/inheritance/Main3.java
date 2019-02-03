package pl.sda.java.basic.day3.inheritance;

public class Main3 {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(2.5f, "Black", true);
        System.out.println(mercedes.seatbeltsFastened());
        mercedes.ride(); // próba jazdy przed uruchomieniem silnika
        System.out.println(mercedes.startEngine());
        mercedes.ride();
        System.out.println(mercedes.isSportVersion()); // dodatkowa funkcjonalność Mercedesa

        Volkswagen vw = new Volkswagen(2, "White");
        System.out.println(vw.seatbeltsFastened());
        vw.ride();
        System.out.println(vw.startEngine());
        vw.ride();
//        vw.isSportVersion(); // brak takiej funkcjonalnośći w VW

        Car syrenka = new Car(3.0f, 4, "Yellow");
        System.out.println(syrenka.seatbeltsFastened());
        syrenka.ride();
        System.out.println(syrenka.startEngine());
        syrenka.ride();
//        System.out.println(syrenka.isSportVersion()); // brak takiej funkcjonalnośći w zwykłym samochodzie

        // Mercedes to Car, więc jest to dopuszczalne
        Car samochodTypuMercedes = new Mercedes(2.0f, "Brown", false);
        // VW to Car, więc jest to dopuszczalne
        Car samochodTypuVw = new Volkswagen(4, "White");
//        samochodTypuMercedes.isSportVersion(); // nie można wywołać ponieważ zadeklarowaliśmy zmienną jako Car, mimo, że Mercedes ma taką funkcjonalność
        samochodTypuMercedes.ride();
        samochodTypuMercedes.startEngine();
        samochodTypuMercedes.ride();
        System.out.println(((Mercedes) samochodTypuMercedes).isSportVersion()); // OStrożnie! Wywołanie ukrytej funkcjonalności za pomocą rzutowania, ponieważ wiemy, że pod spodem jest Mercedes

        samochodTypuVw.ride();
        System.out.println(((Mercedes) samochodTypuVw).isSportVersion()); // Błąd. Nie zostanie to podkreślone przez Intellij, ale program zakończy się niepowodzeniem.
    }
}
