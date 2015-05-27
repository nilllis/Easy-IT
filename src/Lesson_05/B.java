package Lesson_05;

/**
 * Created by пк on 18.05.2015.
 */
public class B {

    static int i = 10;
    int b;

    //счетчик созданных объектов
    static private int count = 0;

    // при создании объекта - это поле инициализируется ПЕРВЫМ
    // ВАЖНО, что это поле одно для всех экземпляров, создаваемых на базе данного класса
    // т.е. инициализируется оно только один раз
    static {
        System.out.println("class B");
    }

    // это поле инициализируется ВТОРЫМ
    {
        System.out.println("class B {} #" + (count + 1));
    }

    // конструктор инициализируется ТРЕТЬИМ
    public B() {
        count++;
        System.out.println("i = " + i);
    }


    void countObjects() {
        System.out.println("Объектов данного класса создано " + count + " шт.");
    }

}
