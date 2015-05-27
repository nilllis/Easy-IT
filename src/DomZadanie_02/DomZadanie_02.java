package DomZadanie_02;

import java.io.IOException;
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

        System.out.println("Good day.");
        char vibor;
        char ignore;
        do {
            if (!mainProcess()) break;
            do {
                System.out.print("Еще раз? y/n: ");
                vibor = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (vibor != 'y' && vibor != 'n');
        } while (vibor == 'y');
    }

    public static boolean mainProcess() throws IOException {

        int[] arr = {a, b, c, d, e, -222};

        char simv;

        System.out.print("\nWe have next array: ");
        pokazatMassiv(arr);
        System.out.println("\nChoose the method for search min value (press 'q' for quit):");
        System.out.println(" 1. Перебор элементов массива.");
        System.out.println(" 2. Сравнение глобальных переменных.");
        System.out.println(" 3. Сортировка массива.");
        System.out.print("Ваш выбор: ");

        do {
            simv = vvodDannih();
            if (simv == 'q') {
                System.out.println("Good bye!");
                return false;
            }
            switch (simv) {
                case '0':
                    System.out.print("Error! Повторите ваш выбор: ");
                    break;
                case '1':
                    System.out.println(" 1й способ. min  = " + minValuePereborom(arr) + "\n");
                    break;
                case '2':
                    System.out.println(" 2й способ. min  = " + minValueSravneniem() + "\n");
                    break;
                case '3':
                    System.out.println(" 3й способ. min  = " + minValueSort(arr) + "\n");
                    break;
            }
        } while (simv == '0');

        return true;
    }

    public static char vvodDannih() throws IOException {
        StringBuffer str = new StringBuffer();
        char simv;
        for (; ; ) {
            simv = (char) System.in.read();
            if (simv == '\n') break;
            str.append(simv);
        }

        if (!correctData(str.toString()))
            return '0';

        return str.charAt(0);
    }

    public static boolean correctData(String str) {
        if (str.length() != 1) return false;

        char simv = str.charAt(0);
        if (simv == '1' || simv == '2' || simv == '3' || simv == 'q') return true;
        return false;
    }


    public static int minValuePereborom(int[] args) {

        // поиск минимального значения массива путем перебора всех элементов
        int min = args[0];

        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;

    }

    public static int minValueSravneniem() {

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

    public static int minValueSort(int[] args) {

        //поиск минимального значения используя сортировку массива
        int[] newArr;
        newArr = Arrays.copyOf(args, args.length);
        Arrays.sort(newArr);
        return newArr[0];

    }

    public static String minValueSortString(int[] args) {

        //особый случай - сортировка String массива, когда все его значения и являются числами - так нельзя искать минимальное значение
        String[] newArr = new String[args.length];
        for (int i = 0; i < args.length; i++)
            newArr[i] = String.valueOf(args[i]);

        Arrays.sort(newArr);
        pokazatMassiv(newArr);
        return newArr[0];

    }


    public static void pokazatMassiv(String[] args) {

        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i == args.length - 1) break;
            System.out.print(", ");
        }
        System.out.print(" ]");

    }

    public static void pokazatMassiv(int[] args) {

        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i == args.length - 1) break;
            System.out.print(", ");
        }
        System.out.print(" ]");

    }

}