package pl.sda.java.basic.day3.inheritance;

public class Car {
    private float capacity;
    private int numberOfDoors;
    private String color;
    private boolean manualGear = true;
    private boolean engineStarted;

    public Car(float capacity, int numberOfDoors, String color) {
        this.capacity = capacity;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public boolean startEngine() {
        engineStarted = true;
        return true;
    }

    public boolean seatbeltsFastened() {
        return true;
    }

    // nie zdefiniowaliśmy poprawnej implementacji metody, powinna być ona nadpisana w klasach dziedziczących
    // w przyszłości poznamy lepsze metody jak sobie z tym radzić
    public void ride() {
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
}
