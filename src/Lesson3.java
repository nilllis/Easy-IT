/**
 * Created by пк on 10.05.2015.
 */
public class Lesson3 {


    public static void primer01(String[] args) {

        byte num_byte = 127;
            System.out.println(num_byte);

        short num_sh = num_byte;
            System.out.println(num_sh);

        float num_float = num_byte;
            System.out.println(num_float);

        char num_char = 75;
            System.out.println(num_char);

        long num_long = 2552;
        num_float = num_long;
        System.out.println(num_float);

        //приведение типа переменной к byte
        byte result = (byte) (num_byte + 1);//выход за предел byte
            System.out.println(result);
    }



    public static void primer02(String[] args) {

        Byte num_byte = 26;//это объект класса оболочки для примитива

        String str = "36587";//это тоже объект
        int result = Integer.valueOf(str);
        System.out.println(result);
    }



    public static void primer03(String[] args) {

        //это объект
        String str_01 = new String ("ooolll");

        //pool thread - пул потока
        //это ускорение работы для Java
        String str = "ooolll";

        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.length());

        //alt+Enter
        int i = str.length();
    }


    public static void primer04(String[] args) {

        int i = 2;
        int b = 3;
            System.out.println(i==b);
            System.out.println("-----------------");


        Integer num01 = new Integer(26);
        Integer num02 = new Integer(26);
            System.out.println(num01 == num02);
            System.out.println(num01.equals(num02));
            System.out.println("---------------");


        Integer i1 = 100;
        Integer i2 = 100;
            System.out.println(i1 == i2);
            System.out.println( i1.equals(i2));

        System.out.println("а если 200");
        i1 = 200;
        i2 = 200;
            System.out.println(i1 == i2);
            System.out.println( i1.equals(i2));
    }

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 5;
        //Lesson_02.Massiv.main();

    }

}
