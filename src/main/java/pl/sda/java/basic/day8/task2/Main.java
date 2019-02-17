package pl.sda.java.basic.day8.task2;

public class Main {
    public static void main(String[] args) {
        NumberMapping numberMapping = new NumberMapping();
        numberMapping.add(5, "asd");
        System.out.println(numberMapping.get(5).isPresent()); // pobieramy wartość (Optional<String>) i sprawdzamy czy optional jest pusty (null) czy nie
        System.out.println(numberMapping.get(3).isPresent());
    }
}
