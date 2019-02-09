package pl.sda.java.basic.day5.homework.calc;

/**
 * @author Michal Jaszczyk
 **/
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Dodawanie " + calculator.add(3, 5));
        System.out.println("Odejmowanie " + calculator.substract(3, 5));
        System.out.println("Mnożenie " + calculator.multiply(3, 5));
        System.out.println("Dzielenie " + calculator.divide(3, 5));
        System.out.println("Dzielenie " + calculator.divide(3, 0));
        System.out.println("Reszta z dzielenia " + calculator.remainder(3, 5));
        System.out.println("Potęgowanie " + calculator.power(3, 5));
        System.out.println("Potęgowanie " + calculator.power(3, 0));
        System.out.println("Potęgowanie " + calculator.manualPower(3, 5));
        System.out.println("Potęgowanie " + calculator.manualPower(3, 0));
        int[] liczby = new int[]{1, 5, 12, 22};
        System.out.println("Suma " + calculator.sum(liczby));
        System.out.println("Max " + calculator.max(liczby));
        System.out.println("Srednia " + calculator.average(liczby));
    }
}
