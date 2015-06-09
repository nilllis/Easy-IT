package DomZadanie_09;

/**
 * Created by пк on 07.06.2015.
 */
public class StringUtils_Impl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null) throw new NullPointerException("number1 is null");
        if (number2 == null) throw new NullPointerException("number2 is null");

        Integer i;
        try {
            i = Integer.parseInt(number1);
        } catch (NumberFormatException obj) {
            throw new NumberFormatException("number1 is not 4islo");
        }
        Integer j;
        try {
            j = Integer.parseInt(number2);
        } catch (NumberFormatException obj) {
            throw new NumberFormatException("number2 is not 4islo");
        }

        if (j == 0) throw new ArithmeticException("number2 = 0");

        return i/j;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
