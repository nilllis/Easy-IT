package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 03.06.2015.
 */
public class FractionNumberOperation_Impl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int divident;
        int divizor;

        if (a.getDivisor() == b.getDivisor()) {
            divident = a.getDivident() + b.getDivident();
            divizor = a.getDivisor();
        } else {
            divident = a.getDivident() * b.getDivisor() + a.getDivisor() * b.getDivident();
            divizor = a.getDivisor() * b.getDivisor();
        }
        return new FractionNumber(divident, divizor);
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int divident;
        int divizor;

        if (a.getDivisor() == b.getDivisor()) {
            divident = a.getDivident() - b.getDivident();
            divizor = a.getDivisor();
        } else {
            divident = a.getDivident() * b.getDivisor() - a.getDivisor() * b.getDivident();
            divizor = a.getDivisor() * b.getDivisor();
        }
        return new FractionNumber(divident,divizor);
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int divident = a.getDivident() * b.getDivident();
        int divizor = a.getDivisor() * b.getDivisor();

        return new FractionNumber(divident,divizor);
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int divident = a.getDivident() * b.getDivisor();
        int divizor = a.getDivisor() * b.getDivident();

        return new FractionNumber(divident,divizor);
    }
}
