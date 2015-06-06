package DomZadanie_07;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by пк on 04.06.2015.
 */
public class CollectionUtils_Demo {

    public static void main(String[] args) {

        CollectionUtils_Impl obj = new CollectionUtils_Impl();

        ArrayList list1 = new ArrayList();
        Integer[] arr1 = {-1, 0, 1, 2, 3, 0};
        for (Integer i : arr1) list1.add(i);

        ArrayList list2 = new ArrayList();
        Integer[] arr2 = {0, -1, -2, -3};
        for (Integer i : arr2) list2.add(i);


        //  1. union
        ArrayList resultUnion = new ArrayList();
        resultUnion.addAll(obj.union(list1, list2));
        System.out.println("union - " + resultUnion);
        //  2. intersection
        ArrayList resultIntersection = new ArrayList();
        resultIntersection.addAll(obj.intersection(list1, list2));
        System.out.println("intersection - " + resultIntersection);
        //  3. unionWithoutDuplicate
        System.out.println("unionWithoutDuplicate - " + obj.unionWithoutDuplicate(list1, list2));
        //  4. intersectionWithoutDuplicate
        System.out.println("intersectionWithoutDuplicate - " + obj.intersectionWithoutDuplicate(list1, list2));
        //  5. difference
        System.out.println("difference - " + obj.difference(list1,list2));
    }
}
