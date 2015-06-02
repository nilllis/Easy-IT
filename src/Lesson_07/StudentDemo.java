package Lesson_07;

import java.util.TreeSet;

/**
 * Created by пк on 02.06.2015.
 */
public class StudentDemo {

    public static void main(String[] args) {

        Student st01 = new Student("Ivan", "Philips", 25);
        Student st02 = new Student("Oleg", "Lg", 22);
        Student st03 = new Student("Petr", "Nokia", 24);

        TreeSet group = new TreeSet();
        group.add(st01);
        group.add(st02);
        group.add(st03);

        System.out.println(group);
        System.out.println(group.size());
        System.out.println(group.first());

    }
}
