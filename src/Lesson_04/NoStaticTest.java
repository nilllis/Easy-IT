package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 26.05.2015.
 */
public class NoStaticTest {

    public static void main(String[] args) {

        int[] arr = {1,1};

        print(arr); //вызывая метод из этого же класса, мы должны назначить этому методу static

        //а вызывая таким образом - можно вызвать no static метод
        NoStaticTest newMy = new NoStaticTest();
        newMy.printNoStatic(arr);

    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //пример использования no static метода
    void printNoStatic (int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
