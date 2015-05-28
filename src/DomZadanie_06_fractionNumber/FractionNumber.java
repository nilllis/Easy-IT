package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 27.05.2015.
 */
public class FractionNumber implements FractionNumberInterfeys {

    private int divident = 1;
    private int divisor;


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
    public void setDivisor(int divisor) {
        if (divisor == 0) throw new IllegalArgumentException();
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return divident + "/" + divisor;
    }

    @Override
    public double value() {
        double d = divident / divisor;
        return d;
    }


}
