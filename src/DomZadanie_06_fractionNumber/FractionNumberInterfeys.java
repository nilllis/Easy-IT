package DomZadanie_06_fractionNumber;

/**
 * Created by пк on 27.05.2015.
 */
public interface FractionNumberInterfeys {

    public static final int DEFAULT_DIVISOR_VALUE = 1;
    public int getDivident();
    public int getDivisor();
    public void setDividend(int dividend);
    public void setDivisor(int divisor);
    public  String toString();
    public double value();

}
