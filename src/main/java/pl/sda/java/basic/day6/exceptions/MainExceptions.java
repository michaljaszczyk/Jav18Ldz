package pl.sda.java.basic.day6.exceptions;

public class MainExceptions {
    public static void main(String[] args) throws Exception { // dodanie sygnatury throws spowoduje wyrzucenie wyjątku na konsolę
        methodThatThrowsException(3); // poprawne wykonanie metody
//        methodThatThrowsException(130); // zostanie rzucony wyjątek
        methodThatExecutesMethodWithException();
        try { // możemy obsłużyć wyjątek za pomocą bloku try-catch
            methodThatThrowsUncheckedException();
        } catch (IndexOutOfBoundsException | NullPointerException e) { //obsługa IndexOutOfBoundsException i NullPointerException tą samą logiką
            // tutaj powinna być logika do obsługi wyjątku
        } catch (RuntimeException e) { // kolejnośc ma znaczenie, od najbardziej szczegółowych do najbardziej ogólnych
            e.printStackTrace();
            // obsłużyc wyjątek lub go zignorować
        }
        System.out.println("koniec programu");
    }

    public static void methodThatThrowsException(int number) throws Exception {
        if (number > 100) {
            throw new Exception();// jeżeli nie jesteśmy w stanie obsłużyć danej sytuacji to możemy rzucić wyjątkiem
//            throw new IOException(); // przykład wyjątku wejścia/wyjścia
        }
        System.out.println("koniec metody");
    }

    public static void methodThatExecutesMethodWithException() {
        try {
            methodThatThrowsException(3); // może zostać rzucony wyjątek
            System.out.println("zwykłe instrukcje"); // nie wykona się w przypadku rzucenia wyjątku w poprzedniej linii
        } catch (Exception e) {
            e.printStackTrace();
            // obsługa wyjątku, powinniśmy zapewnić aby nasza aplikacj dalej działała prawidłowo
        }
        System.out.println("normalne działanie metody"); // zawsze się wykona, ponieważ złapaliśmy wyjątek w bloku try-catch
    }

    public static void methodThatThrowsUncheckedException() {
        throw new RuntimeException(); // wszystkie klasy dziedziczące po RuntimeException są typu unchecked i nie muszą być obsługiwane. W przypadku wystąpienia zakończą działanie całej aplikacji
//        throw new NullPointerException(); // przykłady unchecked excpetion
//        throw new IndexOutOfBoundsException();
    }
}
