package DomZadanie_07;

import java.util.ArrayList;

/**
 * Created by пк on 03.06.2015.
 */
public class ListUtils_Demo {

    public static void main(String[] args) {

        ListUtils_Impl obj = new ListUtils_Impl();


        String[] str = {"one", "two", "three", "eleven"};
        System.out.println(obj.asList(str));


        Double[] dbl = {2.0, 6.5, 2.8, 5.9, 12.0, 2.0};
        ArrayList<Double> spisok = new ArrayList<Double>();
        for(Double x:dbl ) spisok.add(x);
        System.out.println(obj.sortedList(spisok));
    }
}
