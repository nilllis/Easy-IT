package Lesson_08;

/**
 * Created by пк on 07.06.2015.
 */
public class lesson_08 {

    public static void main(String[] args) {
        String name = "easy";
        System.out.println(name);

        if (name.length() > 0) throw new NullPointerException("!!");
        System.out.println("????");
    }
}
