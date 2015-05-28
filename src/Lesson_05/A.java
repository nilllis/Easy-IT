package Lesson_05;

/**
 * Created by пк on 18.05.2015.
 */
public class A {

    public static void main(String[] args) {

        B a1 = new B();
        B.i = 25;// при обращении к полю static указывается имя класса, а не имя объекта
        B a2 = new B();
        B a3 = new B();

        a1.countObjects();

        //  в методе static допускается непосредственный вызов других только static методов
        int i = function();
    }


    static int function(){
        System.out.println("\nНепосредственный вызов возможен только static метода");
        return 1;
    }

}
