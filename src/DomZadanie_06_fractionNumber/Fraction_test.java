package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 27.05.2015.
 */
public class Fraction_test {
    public static void main(String[] args) {

        FractionNumber num1 = new FractionNumber(-2, 5);
        System.out.println(num1 + " = " + num1.value());

        FractionNumber num2 = new FractionNumber(4, 5);
        System.out.println(num2 + " = " + num2.value());


        FractionNumberOperation_Impl numberFract = new FractionNumberOperation_Impl();
        //сложение двух дробей
        System.out.println("add = " + numberFract.add(num1, num2));
        //вычитание
        System.out.println("sub = " + numberFract.sub(num1, num2));
        //умножение
        System.out.println("mult = " + numberFract.mul(num1, num2));
        //деление
        System.out.println("div = " + numberFract.div(num1, num2));

    }
}
