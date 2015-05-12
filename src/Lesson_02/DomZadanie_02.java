package Lesson_02;

/**
 * Created by пк on 11.05.2015.
 */
public class DomZadanie_02 {

    //заданы 4 глобальные переменные, необходимо найти минимальное значение
    static int a = -30;
    static int b = 0;
    static int c = -23330;
    static int d = Integer.MAX_VALUE + 1;

    public static void main(String[] args) {

        int min = a;
        if (min > b){min = b;}
        if (min > c){min = c;}
        if (min > d){min = d;}
            System.out.println("минимальное значение = " + min);

    }

}