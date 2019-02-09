package pl.sda.java.basic.day5.homework.statki;

/**
 * @author Michal Jaszczyk
 **/
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isInRangeFromZeroTo(int x, int y) {
        return this.x >= 0 && this.y >= 0 && this.x < x && this.y < y;
    }
}
