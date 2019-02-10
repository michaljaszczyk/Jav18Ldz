package pl.sda.java.basic.day6.exceptions;

//Aby zdefiniować własny wyjątek typu unchecked wystarczy rozszerzyć klasę RuntimeException
public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
