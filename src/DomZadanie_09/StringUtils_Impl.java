package DomZadanie_09;

import Lesson_08.NoValueException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 * Created by пк on 07.06.2015.
 */
public class StringUtils_Impl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null) throw new NullPointerException("number1 is null");
        if (number2 == null) throw new NullPointerException("number2 is null");

        Integer i;
        try {
            i = Integer.parseInt(number1);
        } catch (NumberFormatException obj) {
            throw new NumberFormatException("number1 is not 4islo");
        }
        Integer j;
        try {
            j = Integer.parseInt(number2);
        } catch (NumberFormatException obj) {
            throw new NumberFormatException("number2 is not 4islo");
        }

        if (j == 0) throw new ArithmeticException("number2 = 0");

        return i / j;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException, NoValueException {

        if (text == null) throw new NullPointerException("text == null");
        if (word == null) throw new NullPointerException("word == null");
        if (word.length() == 0) throw new NoValueException("word.length = 0");


        ArrayList<String> listOfWords = new ArrayList<String>();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char simv = text.charAt(i);
            str.append(simv);
            if ((int) simv == 32 || i == text.length() - 1) {
                listOfWords.add(str.toString().trim());
                str.setLength(0);
            }
        }


        ArrayList<Integer> numbOfWords = new ArrayList<Integer>();
        int num = 0;
        for (String slovo : listOfWords) {
            if (slovo.equals(word)) {
                numbOfWords.add(num);
            }
            num++;
        }

        int [] result =  new int[numbOfWords.size()];
        for (int i = 0; i<numbOfWords.size();i++){
            result[i] = numbOfWords.get(i)+1;
        }

        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        //Pattern p = Pattern.compile();
        return new double[0];
    }
}
