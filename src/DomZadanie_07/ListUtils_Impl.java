package DomZadanie_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by пк on 03.06.2015.
 */
public class ListUtils_Impl implements ListUtils {


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

        ArrayList<String> array = new ArrayList<String>();
        for (String str : strings) array.add(str);

        return array;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {

        Double[] arrTemp = new Double[data.size()];
        for (int i = 0; i < data.size(); i++)
            arrTemp[i] = data.get(i);
        Arrays.sort(arrTemp);

        ArrayList<Double> array = new ArrayList<Double>();
        for (Double x : arrTemp) array.add(x);

        return array;
    }

}
