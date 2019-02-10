package pl.sda.java.basic.day6.exceptions;

//Aby zdefiniować własny wyjątek typu checked wystarczy rozszerzyć klasę Exception
public class MyException extends Exception {
    // poniższe 2 konsturktory przydają się do przekazywania informacji  o wyjątku
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
