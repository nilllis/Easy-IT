package Lesson_07;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by пк on 02.06.2015.
 */
public class lesson {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        int[] arrA = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arrA.length; i++)
            a.add(arrA[i]);

        ArrayList<Integer> b = new ArrayList<Integer>();
        int[] arrB = {3, 4, 5, 6};
        for (int i = 0; i < arrB.length; i++)
            b.add(arrB[i]);



        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++)
                if (a.get(i).equals(b.get(j))) {
                    c.add(a.get(i));
                    continue;
                }
        }
        System.out.println(c.size() + " элементов: ");
        for (int i = 0; i < c.size(); i++)
            System.out.print(c.get(i));
    }
}
