package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 19.05.2015.
 */
public class DomZadanie_04_2 {


    public static void main(String[] args) {

        //    3. Дан массив размерности N,  найти наименьший элемент массива и вывести на консоль
        //      (если наименьших элементов несколько — вывести их все).

        int[] arrMin = {4, 6, -7, 0, -7, -1, 10};
        //int[] arrMin = {-7, -7, -7, -7, -7, -7, -7}; //все элементы минимальны
        //int[] arrMin = {0}; //массив только с одним значением
        System.out.println("исходный массив данных: " + Arrays.toString(arrMin));


        //применим сортировку массива
        Arrays.sort(arrMin);


        //вывод минимального значения массива
        System.out.println("минимальное значение = " + arrMin[0] + '\n');

        //подсчет количества минимальных элементов
        if (arrMin.length > 2 && arrMin[0] == arrMin[1]) {
            int kolvoOdinakovElementov = 1;
            for (int i = 0; i < arrMin.length - 1; i++)
                if (arrMin[i] == arrMin[i + 1]) kolvoOdinakovElementov++;
            System.out.println("таких минимальных элементов в массиве " + kolvoOdinakovElementov + " шт.");
            for (int i = 0; i < kolvoOdinakovElementov; i++)
                System.out.println(arrMin[i]);
        }
    }

}
