package pl.sda.java.basic.day3.classes;

public class Dog {
    private String name;
    private String bread;
    private char gender;

    public Dog(String name, String bread, char gender) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    // Nadpisanie domyślnej metody toString własną implementacją
    @Override
    public String toString() {
        return name + " " + bread + " " + gender + super.toString();
    }
}
