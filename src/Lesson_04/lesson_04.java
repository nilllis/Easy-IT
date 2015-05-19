package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 13.05.2015.
 */
public class lesson_04 {


    public static void main(String[] args) {

        //объявление массива
        //1 способ
        int[] arr1;
        arr1 = new int[10];
        //2 способ
        int[] arr2 = new int[10];
        //3 способ
        int[] arr3 = {1, 2, 3, 4, 5};
        //а так не работает
        int[] arr4;
        //arr4 = {1, 2, 3, 4, 5};

        System.out.println(arr1);//выведет идентефикатор массива и его хеш код, т.е. по сути ссылку на объект
        System.out.println("---------------");

        System.out.println("длина массива - " + arr3.length);
        //System.out.println(arr4.length);//ошибка, т.к. массив неинициализирован

        //вывод массива через цикл for
        System.out.print("arr3: ");
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i]);
        System.out.println();

        //вывод пустого массива int
        System.out.print("int массив (пустой): ");
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i]);
        System.out.println();
        //вывод пустого массива String
        String[] arrStr = new String[3];
        System.out.print("String массив (пустой): ");
        for (int i = 0; i < arrStr.length; i++)
            System.out.print(arrStr[i]);
        System.out.println();
        System.out.println("---------------");


        //вывод массивов через цикл for each
        System.out.println("Вывод String массива через for each: ");
        for (String i : arrStr) System.out.print(i);
        System.out.println();
        System.out.println("Вывод int массива через for each: ");
        for (int i : arr2) System.out.print(i);
        System.out.println("\n---------------");


        //вывод массивов через цикл while
        int count = 0;
        System.out.println("Вывод String массива через while: ");
        while (count < arrStr.length) {
            System.out.print(arrStr[count]);
            count++;
        }
        System.out.println();
        count = 0;
        System.out.println("Вывод int массива через while: ");
        while (count < arr2.length) {
            System.out.print(arr2[count]);
            count++;
        }
        System.out.println("\n---------------");


        //вывод через рекурсию
        System.out.println("Вывод int массива через рекурсию: ");
        iterVivod(arr2, 0);
        System.out.println("Вывод String массива через рекурсию: ");
        iterVivod(arrStr, 0);
        System.out.println("---------------");


        //вывод через Arrays - самый быстрый способ
        System.out.println("Вывод int массива через Arrays: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Вывод String массива через Arrays: ");
        System.out.println(Arrays.toString(arrStr));
        System.out.println("вывод через Arrays - самый быстрый способ");

    }

    /**
     * метод выводит int массив в консоль через рекурсию
     */
    public static void iterVivod(int[] array, int i) {

        System.out.println(i + " - " + array[i]);
        i++;
        if (i < array.length) iterVivod(array, i);

    }

    /**
     * метод выводит String массив в консоль через рекурсию
     */
    public static void iterVivod(String[] array, int i) {

        System.out.println(i + " - " + array[i]);
        i++;
        if (i < array.length) iterVivod(array, i);

    }

}
