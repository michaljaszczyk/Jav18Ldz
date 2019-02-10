package pl.sda.java.basic.day6.task3;

public class Calculator {

    public double divide(double a, double b) throws DivideByZeroException { // informacja jaki wyjątek może zostać rzucony
        if (b == 0) {
            throw new DivideByZeroException("Nie dziel przez 0"); // rzucamy wyjątkiem
        }
        return a / b;
    }
}
