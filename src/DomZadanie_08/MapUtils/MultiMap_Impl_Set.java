package DomZadanie_08.MapUtils;

import DomZadanie_08.MultiMap;
import DomZadanie_08.MultiMap_Impl;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by пк on 22.06.2015.
 */
public class MultiMap_Impl_Set<K, V> extends MultiMap_Impl<K, V> implements MultiMap<K, V> {

    private Map<K, LinkedHashSet<V>> multiMap = new HashMap<K, LinkedHashSet<V>>();

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            multiMap.get(key).add(value);
        } else {
            LinkedHashSet<V> newSet = new LinkedHashSet<V>();
            multiMap.put(key, newSet);
            put(key, value);
        }
        return value;
    }

    @Override
    public String toString() {
        return multiMap.toString();
    }
}
