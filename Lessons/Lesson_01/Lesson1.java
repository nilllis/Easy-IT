package Lesson_01;

/**
 * Created by пк on 06.05.2015.
 */
public class Lesson1 {

    //глобальные переменные
    static byte val_byte;
    static short val_short;
    static int val_int;
    static long val_long;
    static float val_float;
    static double val_double;
    static boolean val_boolean;
    static char val_char;

    //недопустимые имена переменных
    //int this;


    public static void main(String[] args) {

        int num;
        //переменная объявлена, попробуем вывести ее - будет ошибка
        //System.out.println(num);

        num = val_int;
        //переменной присвоим значение другой переменной int, которая тоже только объявлена
            System.out.println("num = " + num);

        num = val_byte;
        //val_byte = num + 100; //если попробовать в byte запихнуть int, то будет ошибка

        //попробуем переменной int присвоить значение переменной byte
        System.out.println(num);
    }
}
