package pl.sda.java.basic.day6.nesting;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
//        PrivateNestedClass // nie ma dostępu, nie jest widoczne
        ParentClass.PublicNestedClass publicNestedClass; // możemy zadeklarować zmienną o danym typie
//        publicNestedClass = new ParentClass.PublicNestedClass(); // nie można utowrzyć nowego obiektu nigdzie poza klasą rodzica
        publicNestedClass = parentClass.returnsNestedClass(); // obiekt tej klasy może zostać zwrócony przez metodę klasy rodzica
        ParentClass.PublicStaticNestedClass publicStaticNestedClass =
                new ParentClass.PublicStaticNestedClass(); // możemy deklarować pola oraz tworzyć obiekty tej klasy

        ExampleInterface exampleInterface = new ExampleInterface() { // klasa anonimowa, dzięki której możemy utworzyć obiekt danego interfejsu/klasy abatrkacyjne bez tworzenia osobnej klasy
            // musimy zaimplementować wszystkie metody abstrakcyjne
            @Override
            public void fun() {
                System.out.println("Implementacja metody abstrakcyjnej");
            }
        };
        exampleInterface.fun(); // wywołanie metody na obiekcie utworzonym za pomocą klasy anonimowej
    }
}
