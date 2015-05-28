package Lesson_05;

/**
 * Created by пк on 18.05.2015.
 */
public class B {

    static int i = 10;
    int b;

    //счетчик созданных объектов
    static private int count = 0;

    // статический блок выполнится ПЕРВЫМ и еще до создания объектов данного класса
    // ВАЖНО, что это поле одно для всех экземпляров, создаваемых на базе данного класса
    // т.е. выполняется оно только один раз
    static {
        System.out.println("class B");
    }

    // это поле выполнится ВТОРЫМ
    {
        System.out.print("class B {} №" + (count + 1) + "  |  ");
    }

    // конструктор выполнится ТРЕТЬИМ
    public B() {
        count++;
        System.out.println("i = " + i);
    }


    void countObjects() {
        System.out.println("Объектов данного класса создано " + count + " шт.");
    }

}
