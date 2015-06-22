package DomZadanie_06_fractionNumber;

/**
 * Интерфейс представляющий число в виде дроби. Для вывода ошибок функции могут бросать IllegalArgumentException
 * Данный интерфейс может быть использован для хранения обычных дробей, например 1/2, 1/4, 3/7 и т.д.
 *
 * Created by пк on 27.05.2015.
 */
public interface FractionNumberInterfeys {

    /**
     * Значение делителя после создания объкта конструктором
     */
    public static final int DEFAULT_DIVISOR_VALUE = 1;

    /**
     * Получить делимое
     *
     * @return делимое
     */
    public int getDividend();

    /**
     * Получить делитель
     *
     * @return делитель
     */
    public int getDivisor();
    /**
     * Установить делимое
     *
     * @param dividend делимое
     */
    public void setDividend(int dividend);

    /**
     * Установить делитель
     *
     * @param divisor делитель
     * @throws IllegalArgumentException если пытаются установить делитель равный 0
     */
    public void setDivisor(int divisor) throws IllegalArgumentException;

    /**
     * Получить символьное представление числа
     * Например если делимое = 1, делитель = 4, то символьное представление числа равно 1/4
     *
     * @return символьное представление числа
     */
    public  String toString();

    /**
     * Получить значение как вещественное число.
     * Например если делимое = 1, делитель = 4, то вещественное число для дроби 1/4 = 0.25
     *
     * @return вещественное число для заднной дроби
     */
    public double value();

}
