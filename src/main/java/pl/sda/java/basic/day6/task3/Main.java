package pl.sda.java.basic.day6.task3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = 0;
        try {
            System.out.println("Tworzenie pliku tymczasowego");
            System.out.println(calculator.divide(3, 1));
            System.out.println(calculator.divide(3, 0));
            result = calculator.divide(3, 0);
            System.out.println(result);
            System.out.println("Koniec");
//            System.out.println("Usuwanie pliku tymczasowego"); // może się nie wykonać jeżeli wcześniej poleci wyjątek
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println("Chciałeś podzielić przez 0"); // wykona się tylko w momencie kiedy poleci wyjątek
        } finally {
            System.out.println("Usuwanie pliku tymczasowego"); // zawsze się wykona, niezależnie czy poleci wyjątek czy nie
            System.out.println("Sprzątanie po wykonaniu bloky try");
        }
        System.out.println("Kolejne instrukcje"); // może się nie wykonać np. w przypadku kiedy zostanie wcześniej rzucony unchecked exception

    }
}
