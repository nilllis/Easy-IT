package Lesson_03;

/**
 * Created by пк on 16.05.2015.
 */
public class Lesson3_1 {

    public static void main(String[] args) {

        Byte num_byte = 26;//это объект класса оболочки для примитива

        String str = "36587";//это тоже объект, оболочка для примитивного типа
        int result = Integer.valueOf(str);
        System.out.println(result);
    }

}
