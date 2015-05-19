package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 17.05.2015.
 */
public class DomZadanie_04 {

    //    1. Создать 3и метода инвертирования массива.

    public static void main(String[] args) {

        String[] arrStr = {"E", "a", "s", "y"};
        //String[] arrStr = {}; //можно задать даже пустой массив

        System.out.println("Инвертирование через дополнительный массив:");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(invert_01(arrStr)));

        System.out.println("Инвертирование через рекурсию:");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(invert_02(arrStr, 0)));

        System.out.println("Инвертирование через дополнительную переменную:");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(invert_03(arrStr)));

    }



    public static String[] invert_01(String[] array) {

        if (array.length == 0) return array; //проверка не пуст ли массив

        int num = array.length;
        String[] newArray = new String[num];

        for (int i = 0; i < num; i++)
            newArray[num - 1 - i] = array[i];

        return newArray;
    }


    public static String[] invert_02(String[] array, int i) {

        if (array.length == 0) return array; //проверка не пуст ли массив

        String str = array[i];
        i++;
        if (i < array.length) invert_02(array, i);

        array[array.length - i] = str;

        return array;
    }


    public static String[] invert_03(String[] array) {

        String memory;
        int num = array.length;

        for (int i = 0; i < num/2; i++) {

            memory = array[i];
            array[i] = array[num - 1 - i];
            array[num - 1 - i] = memory;

        }

        return array;

    }

}
