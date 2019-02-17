package pl.sda.java.basic.day8.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Aby utworzyć wątek możemy implementować interfejs Runnable i zaimplemnetować metodę run
public class ImplementingRunnable implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public ImplementingRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("PONG " + i);
            try {
                if (i > 100) {
                    cyclicBarrier.await(); // metoda zatrzyma się w tym miejscu i będzie czekać na pozostałe wątki
                }
                Thread.sleep(100);
//                TimeUnit.MILLISECONDS.sleep(500); // to samo co wyżej
//                TimeUnit.SECONDS.sleep(1); // to samo co wyżej
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
