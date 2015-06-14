package Lesson_10;

/**
 * Created by пк on 14.06.2015.
 */
public class MyThreadRunnable implements Runnable, Monitor {
    @Override
    public void run() {
        boolean stop = false;
        while (!stop) {
            long timeStart = System.currentTimeMillis();

            for (int i = 0; i < 8; i++) {
                System.out.print(" >> " + Thread.currentThread().getName() + " - " + i);
                System.out.println();
                //System.out.println(" - " + (timeStart - System.currentTimeMillis()));
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i == 6) {
                    synchronized (a) {
                        a.notify();
                    }
                }

                if (i == 7) {
                    System.out.println("Stop " + Thread.currentThread().getName());
                    stop = true;
                }
            }
        }
    }
}
