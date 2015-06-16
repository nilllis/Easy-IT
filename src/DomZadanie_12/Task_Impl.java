package DomZadanie_12;

/**
 * Created by пк on 16.06.2015.
 */
public class Task_Impl implements Task {
    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {

    }
}
