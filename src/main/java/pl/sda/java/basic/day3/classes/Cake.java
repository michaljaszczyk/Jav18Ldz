package pl.sda.java.basic.day3.classes;

public class Cake {
    private float flourInKg;
    private float waterInL;
    private int numberOfEggs;

    public Cake(float flourInKg, float waterInL, int numberOfEggs) {
        this.flourInKg = flourInKg;
        this.waterInL = waterInL;
        this.numberOfEggs = numberOfEggs;
    }

    public boolean isTasty() {
        if (flourInKg > waterInL) {
            return false;
        } else if (numberOfEggs < 1 || numberOfEggs >= 12) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isTasty2() { // to samo działąnie co isTasty
        if (moreFlourThanWater() || badNumberOfEggs()) {
            return false;
        } else {
            return true;
        }
    }

    private boolean badNumberOfEggs() {
        return numberOfEggs < 1 || numberOfEggs > 12;
    }

    private boolean moreFlourThanWater() {
        return flourInKg > waterInL;
    }

}
