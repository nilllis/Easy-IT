package Lesson_10;

/**
 * Created by пк on 14.06.2015.
 */
public class Thread_Demo {

    public static void main(String[] args) {

        MyThread p2 = new MyThread();
        p2.start();

        Thread p3 = new Thread(new MyThreadRunnable());
        p3.start();

        try {
            Thread.sleep(5000);
            System.out.println("главный поток");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
