package Lesson_03;

import Lesson_01.Razdelitel;

/**
 * Created by пк on 16.05.2015.
 */
public class Lesson3_3 {

    public static void main(String[] args) {

        int i = 2;
        int b = 3;
        System.out.println(i == b);
        System.out.println("-----------------");


        Integer num01 = new Integer(26);
        Integer num02 = new Integer(26);
        System.out.println("Следующий пример показывает как надо и как не надо сравнивать переменные, являющиеся объектами");
        System.out.println("сравнение через == дает " + num01 == num02 + " (что неправильно)"); //данная строка выводится как false
        System.out.println("сравнение через свойство equals дает " + num01.equals(num02) + " (что правильно)");
        System.out.println("---------------");


        Integer i1 = 26;
        Integer i2 = 26;
        System.out.println("Следующий пример показывает небольшой ньюанс в сравнении двух Integer переменных:");
        System.out.println("если переменные были объявлены через пул потоков и значение их не более 127, то");
        System.out.println("(при i = " + i1 + ")");
        System.out.print("сравнение через == даст ");
        System.out.println(i1 == i2);
        System.out.print("сравнение через свойство equals тоже даст ");
        System.out.println(i1.equals(i2));

        i1 = 128;
        i2 = 128;
        System.out.println("(а при i = " + i1 + " уже будет следующее)");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("Это введено в Java для ускорения работы.");
    }

}
