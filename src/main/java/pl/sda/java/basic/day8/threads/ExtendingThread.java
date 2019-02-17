package pl.sda.java.basic.day8.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Aby utworzyć wątek możemy dziedziczyć po klasie Thread i nadpisać metodę run
public class ExtendingThread extends Thread {
    private CyclicBarrier cyclicBarrier;

    public ExtendingThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("PING " + i);
            try {
                if (i > 50) {
                    cyclicBarrier.await(); // metoda zatrzyma się w tym miejscu i będzie czekać na pozostałe wątki
                }
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
