package Lesson_03;

/**
 * Created by пк on 16.05.2015.
 */
public class Lesson3_2 {

    public static void main(String[] args) {

        //это объект
        String str_01 = new String ("ooolll");

        //объявление через pool thread - пул потока
        //объявляя переменную следующим образом - это ускорение для Java
        String str = "оооллл";

        System.out.println("переменная типа String с используемым свойством toUpperCase - " + str.toUpperCase());
        System.out.println("сама переменная не изменилась - " + str);
        System.out.println("длина переменной - " + str.length());

        //alt+Enter - подсказка, о том, что надо указать тип переменной
        int i = str.length();
    }

}
