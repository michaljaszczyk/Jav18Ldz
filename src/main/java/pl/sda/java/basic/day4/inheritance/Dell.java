package pl.sda.java.basic.day4.inheritance;

public class Dell extends Laptop {
    public Dell(int ram, int diskSizeInGb, float screenSize) {
        // wszystkie obiekty Dell będą miały procesor i7 oraz podświetlenie klawiatury
        super("I7", ram, diskSizeInGb, true, screenSize);
    }
}
