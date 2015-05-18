package Lesson_03;

/**
 * Created by пк on 10.05.2015.
 */
public class Lesson3 {


    public static void main(String[] args) {

        byte num_byte = 127;
            System.out.println("byte - " + num_byte);

        short num_sh = num_byte;
            System.out.println("short - " + num_sh);

        float num_float = num_byte;
            System.out.println("float - " + num_float);

        char num_char = 75;
            System.out.println("char - " + num_char);

        long num_long = 2552;
        num_float = num_long;
        System.out.println("long переведенный во float - " + num_float);

        //приведение типа переменной к byte, т.к при сложении Java по умолчанию думает, что мы прибавляем int
        byte result = (byte) (num_byte + 1);
            System.out.println("выход за предел byte: "+ num_byte + " + 1 = " + result);
    }

}
