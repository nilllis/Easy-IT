package Lesson_05;

/**
 * Created by пк on 18.05.2015.
 */
public class B {

    static int i = 10;
    int b;

    static {
        System.out.println("class B");
    }

    {
        System.out.println("class B {}");
    }

    public B() {
        System.out.println("i = " + i);
    }

}
