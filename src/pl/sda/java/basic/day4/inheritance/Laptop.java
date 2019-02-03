package pl.sda.java.basic.day4.inheritance;

public class Laptop extends Computer {

    // dodatkowe cechy klasy Laptop
    private boolean backlightKeyboard;
    private float screenSize;

    public Laptop(
            String processorName,
            int ram,
            int diskSizeInGb,
            boolean backlightKeyboard, // możliwość ustawienia dodatkowych cech klasy Laptop
            float screenSize
    ) {
        super(processorName, ram, diskSizeInGb);
        this.backlightKeyboard = backlightKeyboard;
        this.screenSize = screenSize;
    }

    public boolean isBacklightKeyboard() {
        return backlightKeyboard;
    }

    public float getScreenSize() {
        return screenSize;
    }
}
