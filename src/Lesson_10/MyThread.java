package Lesson_10;

/**
 * Created by пк on 14.06.2015.
 */
public class MyThread extends Thread implements Monitor {

    @Override
    public void run() {
        boolean stop = false;
        while (!stop) {
            long timeStart = System.currentTimeMillis();

            for (int i = 0; i < 8; i++) {
                try {
                    Thread.sleep(500);
                    System.out.print(" >> " + Thread.currentThread().getName() + " - " + i);
                    System.out.println();
                    //System.out.println(" - " + (timeStart - System.currentTimeMillis()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i == 2) {
                    try {
                        synchronized (a) {
                            a.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
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
