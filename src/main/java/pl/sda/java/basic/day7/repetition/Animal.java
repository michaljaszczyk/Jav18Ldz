package pl.sda.java.basic.day7.repetition;

public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
