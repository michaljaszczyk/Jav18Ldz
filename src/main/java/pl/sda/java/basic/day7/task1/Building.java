package pl.sda.java.basic.day7.task1;

public abstract class Building {
    private final int numberOfFloors; // stała, wartość jest przypisana w konstruktorze

    public Building(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors; // od tego momentu nie możemy zmienić wartości stałej
    }

    // metoda z modyfikatorem final nie może być nadpisana
    public final int getNumberOfFloors() {
        return numberOfFloors;
    }

    public abstract BuildingType getBuildingType(); // metoda abstrakcyjna, musi być zaimplementowana przez wszystkie klasy dziedziczące
}
