package DomZadanie_04;

import java.util.Arrays;

/**
 * Created by пк on 19.05.2015.
 *
 * 4. Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
 * После замены будет выглядеть {4, 8, 0, 6, -5}.
 */
public class DomZadanie_04_3 {

    public static void main(String[] args) {

        System.out.println("Поменять наибольший и наименьший элементы массива местами:\n");

    int[] arrInt = {4, -5, 0, 0, 6, 8};
    int minNum = 0;
    int min = arrInt[minNum];
    int maxNum = 0;
    int max = arrInt[maxNum];

    for (int n = 0; n < arrInt.length; n++) {
        if (arrInt[n] < min) {
            min = arrInt[n];
            minNum = n;
        }
        if (arrInt[n] > max) {
            max = arrInt[n];
            maxNum = n;
        }
    }

    System.out.println("исходный массив: " + Arrays.toString(arrInt));
    arrInt[minNum] = max;
    arrInt[maxNum] = min;
    System.out.println("min: " + min + "\nmax: " + max);
    System.out.println("результат: " + Arrays.toString(arrInt));

    }
}
