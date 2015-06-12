package DomZadanie_08;

import java.util.*;

/**
 * Created by пк on 11.06.2015.
 */
public class MultiMap_Impl<K, V> extends HashMap<K, V> implements MultiMap<K, V> {

    private Map<K, ArrayList<V>> multiMap = new HashMap<K, ArrayList<V>>();

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            values.add(value);
        } else {
            ArrayList<V> values = new ArrayList<V>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public V get(Object key) {
        if (key == null || key.equals("")) {
            return (V) "";
        }
        ArrayList<V> values = multiMap.get(key);
        if (values.size() == 0) {
            return (V) "";
        }
        return values.get(values.size() - 1);
    }

    @Override
    public V remove(Object key) {
        ArrayList<V> values = multiMap.get(key);
        values.removeAll(values);
        return null;
    }

    @Override
    public String toString() {
        return "MultiMap_Impl [" + multiMap + ']';
    }

    @Override
    public void clear() {
        multiMap = new HashMap<K, ArrayList<V>>();
    }

    @Override
    public Object clone() {
        Set<K> setKeys = multiMap.keySet();
        MultiMap_Impl<K, V> multiMapNew = new MultiMap_Impl<K, V>();

        for (Iterator<K> iterator = setKeys.iterator(); iterator.hasNext(); ) {
            K key = iterator.next();
            for (Iterator<V> iteratorValue = multiMap.get(key).iterator(); iteratorValue.hasNext(); ) {
                multiMapNew.put(key, iteratorValue.next());
            }
        }
        return multiMapNew;
    }




    @Override
    public int countValues(K key) {
        return multiMap.get(key).size();
    }


    @Override
    public Iterator<V> valuesIterator(K key) {
        ArrayList<V> values = multiMap.get(key);
        return values.iterator();
    }


}
