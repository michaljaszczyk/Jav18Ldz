package pl.sda.java.basic.day8.task4;

// Aby utworzyć wątek możemy dziedziczyć po klasie Thread i nadpisać metodę run
public class EvenNumberCounter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
