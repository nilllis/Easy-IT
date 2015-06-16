package DomZadanie_12;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by пк on 16.06.2015.
 */
public class TasksStorage_Impl implements TasksStorage {

    private List<Task> queue = new LinkedList<>();

    @Override
    public void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("task == null");
        }
        queue.add(task);
    }

    @Override
    public Task get() {
        if (count() == 0) {
            return null;
        }

        Task task = new Task_Impl();
        int num = 0;
        task = queue.get(num);
        task.incTryCount();
        queue.remove(num);

        return task;
    }

    @Override
    public int count() {
        return queue.size();
    }
}
