package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 27.05.2015.
 */
public class FractionNumber implements FractionNumberInterfeys {

    private int divident;
    private int divisor;


    FractionNumber(int divident, int divisor) {
        setDividend(divident);
        setDivisor(divisor);
    }

    @Override
    public int getDivident() {
        return divident;
    }

    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(int divisor)  { //throw new IllegalArgumentException()
        if (divisor == 0) {
            this.divisor = DEFAULT_DIVISOR_VALUE;
        } else this.divisor = divisor;
    }

    @Override
    public String toString() {
        return divident + "/" + divisor;
    }

    @Override
    public double value() {
        return  (double) divident / divisor;
    }

}
