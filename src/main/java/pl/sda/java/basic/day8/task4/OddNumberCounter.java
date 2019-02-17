package pl.sda.java.basic.day8.task4;

// Aby utworzyć wątek możemy implementować interfejs Runnable i zaimplemnetować metodę run
public class OddNumberCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
