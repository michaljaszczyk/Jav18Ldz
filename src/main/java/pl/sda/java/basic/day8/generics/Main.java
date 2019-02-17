package pl.sda.java.basic.day8.generics;


import pl.sda.java.basic.day8.task1.Person;

public class Main {
    public static void main(String[] args) {
        // Utworzenie nowego obiektu klasy generycznej. W nawiasach trójkątnych podajemy typ (analogicznie jak w przypadku kolekcji)
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.set("Hello World!"); // metody przyjmują tylko podany wcześniej typ, w tym wypadku String
        String someString = genericClass.get(); // metoda zwraca podany wcześniej typ
        System.out.println(someString);

        // możemy podać tylko typ, który dziedziczy po klasie Number (np. Long)
        MoreRestrictiveGenericClass<Long> genericClass2 = new MoreRestrictiveGenericClass<>();
        double result = genericClass2.add(4L, 6L); // w argumencie metody dopuszczalny jest tylko wcześniej zdefiniowany typ
        System.out.println(result);

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.print("dddd"); // przykłady użycia metody generycznej
        genericMethod.print(5);
        genericMethod.print(new Person("aaa", "ddd"));
    }
}
