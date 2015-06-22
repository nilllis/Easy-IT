package DomZadanie_08.MapUtils;

import DomZadanie_08.MultiMap_Impl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by пк on 22.06.2015.
 */
public class MapUtils_Demo {

    public static void main(String[] args) {

        Map map1 = new LinkedHashMap();
        map1.put("mmm", new Integer(1));
        map1.put("ooo", new Integer(1));
        map1.put("uuu", new Integer(1));
        System.out.println(map1.toString());

        Map map2 = new LinkedHashMap();
        map2.put("mmm", new Integer(1));
        map2.put("ooo", new Integer(2));
        map2.put("uuu", new Integer(2));
        System.out.println(map2.toString());

        Map map3 = new LinkedHashMap();
        map3.put("mmm", new Integer(1));
        map3.put("ooo", new Integer(3));
        map3.put("ttt", new Integer(3));
        System.out.println(map3.toString());


        MapUtils_Impl myMultiMap = new MapUtils_Impl();
        myMultiMap.merge(map1,map2,map3);
        System.out.println(myMultiMap);

    }
}
