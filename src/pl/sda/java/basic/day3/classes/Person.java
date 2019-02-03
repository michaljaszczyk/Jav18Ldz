package pl.sda.java.basic.day3.classes;

public class Person {
    private String firstName = "Gal"; // domyślna wartość, będzie użyta w przypadku skorzystanie z konstruktora bezparametrowego
    private String surname = "Anonim";
    private int age;

    public Person() {
    }

    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
