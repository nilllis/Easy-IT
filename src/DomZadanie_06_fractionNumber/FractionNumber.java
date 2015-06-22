package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 27.05.2015.
 */
public class FractionNumber implements FractionNumberInterfeys {

    private int divident;
    private int divisor;

    FractionNumber() {
        setDivisor(DEFAULT_DIVISOR_VALUE);
    }

    FractionNumber(int divident, int divisor) throws IllegalArgumentException {
        setDividend(divident);
        setDivisor(divisor);
    }

    @Override
    public int getDividend() {
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
    public void setDivisor(int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor must be > 0");
        }

        if (divisor < 0) {
            setDividend(getDividend() * -1);
            divisor *= -1;
        }
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return divident + "/" + divisor;
    }

    @Override
    public double value() {
        return (double) divident / divisor;
    }

}
