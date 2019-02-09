package pl.sda.java.basic.day3.inheritance;

public class Mercedes extends Car {

    private boolean sportVersion;

    public Mercedes(float capacity, String color, boolean sportVersion) {
        super(capacity, 4, color);
        this.sportVersion = sportVersion;
    }

    public boolean isSportVersion() {
        return sportVersion;
    }

    @Override
    public void ride() {
        if (isEngineStarted()) {
            System.out.println("Jadę bardzo szybko");
        } else {
            System.out.println("Nie jadę");
        }
    }
}
