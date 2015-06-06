package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 03.06.2015.
 */
public interface FractionNumberOperation {

    FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException;

    FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException;

    FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException;

    FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException;

}
