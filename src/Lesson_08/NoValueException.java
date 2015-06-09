package Lesson_08;

/**
 * Created by пк on 09.06.2015.
 */
public class NoValueException extends RuntimeException {
    private static final long serialVersionUID = 5162710183389028792L;

    public NoValueException() {
        super();
    }

    public NoValueException(String message) {
        super(message);
    }
}
