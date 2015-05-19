package Lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by пк on 11.05.2015.
 */
public class DomZadanie_02 {

    //заданы 5 глобальных переменных, необходимо найти минимальное значение
    static int a = -30;
    static int b = 0;
    static int c = -23330;
    static int d = 70;
    static int e = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        int[] arr = {a, b, c, d, e, -222};
        String str;

        BufferedReader vvod = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Good day.\nWe have next array ");
            PokazatMassiv(arr);
            System.out.print("\nChoose the method for search min value (press 'q' for quit):" + "\nPress 1 or 2 or 3: ");

            str = vvod.readLine();

            if (str.charAt(0) == '1')
                System.out.println("минимальное значение 1й способ (перебор элементов) = " + MinValuePereborom(arr) + "\n\n");
            if (str.charAt(0) == '2')
                System.out.println("минимальное значение 2й способ (сравнение глобальных переменных) = " + MinValueSravneniem() + "\n\n");
            if (str.charAt(0) == '3')
                System.out.println("минимальное значение 3й способ (сортировка массива) = " + MinValueSort(arr) + "\n\n");

        } while (str.charAt(0) != 'q');
        
    }


    public static int MinValuePereborom(int[] args) {

        // поиск минимального значения массива путем перебора всех элементов
        int min = args[0];

        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;

    }

    public static int MinValueSravneniem() {

        // поиск минимального значения массива путем сравнения глобальных переменных
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        if (min > e) {
            min = e;
        }

        return min;

    }

    public static int MinValueSort(int[] args) {

        //поиск минимального значения используя сортировку массива
        int[] newArr;
        newArr = Arrays.copyOf(args, args.length);
        Arrays.sort(newArr);
        return newArr[0];

    }

    public static String MinValueSortString(int[] args) {

        //особый случай - сортировка String массива - так нельзя искать минимальное значение
        String[] newArr = new String[args.length];
        for (int i = 0; i < args.length; i++)
            newArr[i] = String.valueOf(args[i]);

        newArr[0] = "tt";
        Arrays.sort(newArr);
        PokazatMassiv(newArr);
        return newArr[0];

    }





    public static void PokazatMassiv(String[] args) {

        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i == args.length - 1) break;
            System.out.print(", ");
        }
        System.out.println(" ]");

    }

    public static void PokazatMassiv(int[] args) {

        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i == args.length - 1) break;
            System.out.print(", ");
        }
        System.out.println(" ]");

    }

}