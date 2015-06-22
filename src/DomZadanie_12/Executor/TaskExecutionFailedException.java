package DomZadanie_12.Executor;

/**
 * Непредвиденные ошибки во время выполнения задачи
 */
public class TaskExecutionFailedException extends Exception {
    private static final long serialVersionUID = -3853034940823091780L;

    public TaskExecutionFailedException(String message) {
        super(message);
    }

    public TaskExecutionFailedException(Throwable cause) {
        super(cause);
    }

    public TaskExecutionFailedException(String message, Throwable cause) {
        super(message, cause);
    }

}
