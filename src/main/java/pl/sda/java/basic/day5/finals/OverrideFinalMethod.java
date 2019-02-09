package pl.sda.java.basic.day5.finals;

// nie będzie można rozszerzyć tej klasy przez słowo kluczowe final
public final class OverrideFinalMethod extends FinalKeyword {

    public OverrideFinalMethod(int someNumber) {
        super(someNumber);
    }

    // można normalnie nadpisać
    @Override
    public void fun() {

    }

    // nie można nadpisać bo metoda w klasie bazowej jest final
//    public void methodThatCannotBeOverriden() {
//
//    }
}
