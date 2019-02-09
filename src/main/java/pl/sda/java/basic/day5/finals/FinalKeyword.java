package pl.sda.java.basic.day5.finals;

public class FinalKeyword {
    private final int number = 5; // stała z przypisaną od razu wartością
    private final int anotherNumber; // stała z przypisaną wartością w konstruktorze (ostatnie miejsce kiedy można to zrobić)

    public FinalKeyword(int someNumber) {
        this.anotherNumber = someNumber;
    }

    public void fun() {
//        number = 4; // nie można zmienić bo final
    }

    // nie będzie można nadpisać tej metody przez słowo kluczowe final
    public final void methodThatCannotBeOverriden() {

    }
}
