package Lesson_01;

/**
 * Created by пк on 06.05.2015.
 */
public class TestMain {

    //fields
    //видны во всем классе
    static int i; //по умолчанию 0


    //methods
    public static void main(String[] args) {

        int a = 0x7FFF;
        int b = 100255633;

        float c = 2.36f;

        char name = 'h';

        int i = 80;
        int j = 5;
            System.out.println(i + "%" + j + " = " + i%j + "(остаток от деления)");


        int n = Integer.MAX_VALUE;
            System.out.println(++n); //выход за пределы инта
            Razdelitel.Punktir();

        int x = 0;
            System.out.println("x = " + x);
            System.out.println("x++ = " + x++ + " (переменная сначала вывелась в консоль как равная 0, а только потом была увеличена)");
            System.out.println("вот ее значение в памяти: x = " + x);
            System.out.println("++x = " + ++x + " (переменная сначала увеличилась, а потом вывелась на консоль)");
            Razdelitel.Punktir();

        x=1;
        i= x++ + ++x;
        System.out.println(i);

    }

}
