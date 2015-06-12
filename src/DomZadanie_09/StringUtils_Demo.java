package DomZadanie_09;

import java.util.Arrays;

/**
 * Created by пк on 07.06.2015.
 */
public class StringUtils_Demo {

    public static void main(String[] args) {

        StringUtils_Impl obj = new StringUtils_Impl();
        Double d;
        try {
            d = obj.div("12", "0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String string = "oo ni oo is ";
        String word = "oo";
        int[] result = obj.findWord(string, word);
        System.out.println("\nSTRING: " + string + "\nWORD: " + word);
        System.out.println(Arrays.toString(result));


    }
}
