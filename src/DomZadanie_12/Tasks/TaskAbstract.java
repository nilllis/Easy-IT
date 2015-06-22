package DomZadanie_12.Tasks;

/**
 * Created by пк on 16.06.2015.
 */
public abstract class TaskAbstract implements Task {
    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }


}
