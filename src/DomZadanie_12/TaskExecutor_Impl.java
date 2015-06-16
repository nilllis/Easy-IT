package DomZadanie_12;

/**
 * Created by пк on 16.06.2015.
 */
public class TaskExecutor_Impl implements TaskExecutor {

    private TasksStorage storage = null;

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

        while (true) {

            try {
                Thread.sleep(100);
                if (storage.count() > 0) {
                    Task newTask = storage.get();
                    newTask.incTryCount();
                    try {
                        newTask.execute();
                    } catch (TaskExecutionFailedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stop() throws IllegalStateException {

    }
}
