package DomZadanie_08.MapUtils;

import DomZadanie_08.MultiMap;

import java.util.Map;

/**
 * @author nedis
 * @version 1.0
 */
public interface MapUtils {

    /**
     * Объединение карт. РЕзультирующая карта должна содержать все ключи с исходных карт и все значения.
     * Если в двух разных картах будет один и тот же ключ но разные значения, то результирующая карта должна содержать
     * два занчения для указанного ключа. Если значения одинаковы, то только одно значение, т.е. без дубликатов
     *
     * @param maps карты
     * @return результирующая карта
     * @throws IllegalArgumentException если какая-то карта равно null
     */
    MultiMap<String, Integer> merge (Map<String, Integer>... maps) throws IllegalArgumentException;
}
