package Lesson_06;

/**
 * Created by пк on 27.05.2015.
 */
public class Operation_test {

    public static void main(String[] args) {

        Operation_Impl obj1 = new Operation_Impl();
        System.out.println(obj1.sum(2,5));
        System.out.println(obj1.mult(2,5));
        System.out.println();

        Operation_Impl2 obj2 = new Operation_Impl2();
        System.out.println(obj2.sum(2,5));
        System.out.println(obj2.mult(2,5));
        System.out.println(obj2.kvadrat(12));
        System.out.println();

        Operation interf1 = new Operation_Impl();
        System.out.println(interf1.sum(2,5));
        Operation interf2 = new Operation_Impl2();
        System.out.println(interf2.sum(2,5));

        operationDo(interf1);
        operationDo(interf2);
    }

    public static void operationDo(Operation a){
        System.out.println(a);
    }
}
