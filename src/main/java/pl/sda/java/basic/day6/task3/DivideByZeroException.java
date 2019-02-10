package pl.sda.java.basic.day6.task3;

// nasz własny wyjątek
public class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
