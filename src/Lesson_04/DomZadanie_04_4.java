package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 19.05.2015.
 */
public class DomZadanie_04_4 {

    public static void main(String[] args) {

    //    5. Найти среднее арифметическое всех элементов массива.
    int[] arrInt = {4, -5, 0, 0, 6, 8};
        System.out.println("исходный массив: " + Arrays.toString(arrInt));

    int sum = 0;

    for (int x = 0; x < arrInt.length; x++)
    sum += arrInt[x];
    double srednArifm = (double) sum / arrInt.length;

    System.out.println("среднее арифметическое - " + srednArifm);

    }
}
