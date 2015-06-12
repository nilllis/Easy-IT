package DomZadanie_08;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by пк on 11.06.2015.
 */
public class MultiMap_Test {
    public static void main(String[] args) {

        MultiMap_Impl<String, Integer> myMap = new MultiMap_Impl();

        for (int i = 2; i < 10; i += 2) {
            myMap.put("4etn", i);
        }
        for (int i = 11; i < 100; i += 22) {
            myMap.put("ne4etn", i);
        }
        myMap.put("positive", 100);
        myMap.put("negative", -100);
        myMap.put(null, 0);


        System.out.println("--myMap--\t\t" + myMap + "\n");

        System.out.println("count of 'ne4etn': " + myMap.countValues("ne4etn") + " шт.");

        myMap.remove(null);
        System.out.println("--after remove--\t\t" + myMap + "\n");

        for (Iterator iter = myMap.valuesIterator("ne4etn"); iter.hasNext(); ) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("\nlast value of ne4etn = " + myMap.get("ne4etn"));

        for (Iterator iter = myMap.valuesIterator("4etn"); iter.hasNext(); ) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("\nlast value of 4etn = " + myMap.get("4etn"));
        System.out.println();


        //клонирование объекта MultiMap_Impl
        MultiMap_Impl<String, Integer> testMap = (MultiMap_Impl) myMap.clone();
        myMap.put("negative", -100);
        System.out.println("--myMap--\t\t" + myMap);
        System.out.println("--testMap--\t\t" + testMap + "\n");

        //стереть все данные из объекта MultiMap_Impl
        myMap.clear();
        System.out.println("--clear multiMap--\t\t" + myMap);

    }
}
