package pl.sda.java.basic.day8.task4;

public class Main {
    public static void main(String[] args) {
        EvenNumberCounter evenNumberCounter = new EvenNumberCounter();
        evenNumberCounter.start();

        OddNumberCounter oddNumberCounter = new OddNumberCounter();
        new Thread(oddNumberCounter).start();

        new Thread(() -> System.out.println("PING")).start();

        // to samo co wyżej
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("PONG");
            }
        }).start();
    }
}
