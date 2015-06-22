package DomZadanie_08.MapUtils;

import DomZadanie_08.MultiMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by пк on 22.06.2015.
 */
public class MapUtils_Impl implements MapUtils {

    MultiMap<String, Integer> myMultiMap = new MultiMap_Impl_Set<String, Integer>();

    @Override
    public MultiMap<String, Integer> merge(Map<String, Integer>... maps) throws IllegalArgumentException {
        for (Map<String, Integer> map : maps) {
            Set<String> keySet = map.keySet();
            for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ) {
                String key = iterator.next();
                Integer value = map.get(key);
                if (value == null) continue;
                myMultiMap.put(key, value);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "myMultiMap >>> " + myMultiMap.toString();
    }
}
