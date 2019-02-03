package pl.sda.java.basic.day3.inheritance;

public class Volkswagen extends Car {

    public Volkswagen(int numberOfDoors, String color) {
        super(1.4f, numberOfDoors, color);
    }

    @Override
    public void ride() {
        startEngine();
        System.out.println("Jadę");
    }
}
