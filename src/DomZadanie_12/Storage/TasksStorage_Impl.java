package DomZadanie_12.Storage;

import DomZadanie_12.Tasks.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by пк on 16.06.2015.
 */
public class TasksStorage_Impl implements TasksStorage {

    private List<Task> queue = new LinkedList<Task>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("task == null");
        }
        queue.add(task);
    }

    @Override
    public synchronized Task get() {
        if (count() == 0) {
            return null;
        }
        return queue.remove(0);
    }

    @Override
    public synchronized int count() {
        return queue.size();
    }
}
