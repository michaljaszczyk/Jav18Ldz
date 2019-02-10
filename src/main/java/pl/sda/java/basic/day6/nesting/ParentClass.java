package pl.sda.java.basic.day6.nesting;

public class ParentClass {

    private PrivateNestedClass privateNestedClass; // możemy korzystać z klas wewnętrznych np. do deklaracji pól w tej klasie
    private PublicNestedClass publicNestedClass;
    private PublicStaticNestedClass publicStaticNestedClass;

    // utworzenie obiektu klasy wewnętrznej i zwrócenie go na zewnątrz
    public PublicNestedClass returnsNestedClass() {
        return new PublicNestedClass();
    }

    // tylko na potrzeby klasy bazowej. Nie jest widoczna na zewnątrz
    private class PrivateNestedClass {
    }

    // widoczna na zewnątrz, ale nie można utworzyć na zewnątrz nowego obiektu tej klasy
    public class PublicNestedClass {
    }

    // widoczna na zewnątrz i można utworzyć na zewnątrz nowy obiekt tej klasy
    public static class PublicStaticNestedClass {
    }
}
