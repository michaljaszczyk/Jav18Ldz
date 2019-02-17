package pl.sda.java.basic.day8.generics;

public class GenericClass<T> {
    private T someValue;

    public void set(T value) {
        this.someValue = value;
    }

    public T get() {
        return someValue;
    }

    public String convertToString(T value) {
//        value.toString(); // dla poprawnych łąncuchów znakowych efekt ten sam co niżej, ale wywali się w przypadku wartości null
        return String.valueOf(value);
    }
}
