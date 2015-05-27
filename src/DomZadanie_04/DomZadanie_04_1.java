package DomZadanie_04;

/**
 * Created by пк on 18.05.2015.
 *
 * 2. Создайте массив, содержащий 10 первых нечетных чисел.
 * Выведете элементы массива на консоль в одну строку, разделяя запятой.
 */
public class DomZadanie_04_1 {

    public static void main(String[] args) {

        int[] ne4etn = new int[10];
        int i = 0;

        //заполнение массива
        int num = 0;
        do {
            if (num % 2 > 0) {
                ne4etn[i] = num;
                i++;
            }
            num++;
        } while (i < ne4etn.length);

        //вывод массива
        System.out.print("[ ");
        for (int n = 0; n < ne4etn.length; n++) {
            System.out.print(ne4etn[n]);
            if (n != ne4etn.length - 1) System.out.print(", ");
        }
        System.out.println(" ]");

    }

}
