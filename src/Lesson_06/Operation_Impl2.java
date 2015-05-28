package Lesson_06;

/**
 * Created by пк on 27.05.2015.
 */
public class Operation_Impl2 implements Operation {

    @Override
    public int sum(int a, int b) {
        return a * 2 + b * 2;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    public int mult(int a, int b) {
        return 222;
    }

    public int kvadrat(int a) {
        return a * a;
    }
}
