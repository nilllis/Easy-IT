package Lesson_02;

import Lesson_01.Razdelitel;

import java.util.Arrays;

/**
 * Created by пк on 11.05.2015.
 */
public class DomZadanie_02 {

    //заданы 5 глобальных переменных, необходимо найти минимальное значение
    static int a = -30;
    static int b = 0;
    static int c = -23330;
    static int d = 70;
    static int e = Integer.MAX_VALUE;

    public static void main(String[] args) {

        int min = a;
        if (min > b){min = b;}
        if (min > c){min = c;}
        if (min > d){min = d;}
        if (min > e){min = e;}
            System.out.println("минимальное значение = " + min);
            Razdelitel.Punktir();

        int[] arr = {a, b, c, d, e, -222};
            MinValueVMassive(arr);


    }

    public static void MinValueVMassive(int[] args){

        int min = args[0];

        // 1й способ - перебор элементов массива
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {min = args[i];}
        }
        System.out.println("минимальное значение 1й способ (перебор элементов) = " + min);
        Razdelitel.Punktir();


        // создадим новый массив и передадим в него все данные из известного массива
        int[] newargs = args;
        // при этом новый массив - это лишь ссылка на объект, который хранится в ОЗУ, покажем это
        System.out.println("до изменения = " + args[5]);
        newargs[5]= 565656;
        System.out.println("после изменения = " + args[5]);
        Razdelitel.Punktir();


        //2й способ - сортировка массива
        String[] argsString = new String[args.length];
        for (int i = 0; i < args.length; i++)
            argsString[i] = String.valueOf(args[i]);

        argsString[0] = "tt";
        PokazatMassiv(argsString);

        Arrays.sort(argsString); //сортировка массива регулярным выражением
        PokazatMassiv(argsString);
        System.out.println("минимальное значение 2й способ (сортировка массива) = " + argsString[0]);
    }

    public static void PokazatMassiv(String[] args){
        System.out.println();
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        System.out.println();
    }

}