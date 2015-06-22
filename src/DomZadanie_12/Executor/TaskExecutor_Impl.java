package DomZadanie_12.Executor;

import DomZadanie_12.Storage.TasksStorage;
import DomZadanie_12.Tasks.Task;

/**
 * Created by пк on 16.06.2015.
 */
public class TaskExecutor_Impl implements TaskExecutor, Runnable {

    private TasksStorage storage = null;
    private boolean stop = false;


    public TaskExecutor_Impl() {
    }

    public TaskExecutor_Impl(TasksStorage storage) {
        this.storage = storage;
    }


    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        if (storage == null) {
            throw new NullPointerException("storage == null");
        }
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        if (storage == null) {
            throw new NullPointerException("start() >>> storage == null");
        }

        Thread potok = new Thread(this);
        potok.start();
    }


    @Override
    public void stop() throws IllegalStateException {
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            Task task = storage.get();
            if (task == null) {
                try {
                    System.out.println(Thread.currentThread().getName() + " >>> Спим 1 секунду");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    task.execute();
                } catch (Exception e) {
                    int count = task.getTryCount();
                    if (count < 5) {
                        storage.add(task);
                    } else {
                        System.out.println("Невозможно выполнить task: " + task.getClass().toString());
                    }
                }
            }

        }
    }
}

