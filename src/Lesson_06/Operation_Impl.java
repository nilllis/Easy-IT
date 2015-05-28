package Lesson_06;

/**
 * Created by пк on 27.05.2015.
 */
public class Operation_Impl implements Operation {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    public int mult(int a, int b) {
        return 111;
    }
}
