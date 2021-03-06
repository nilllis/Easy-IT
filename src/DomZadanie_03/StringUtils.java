package DomZadanie_03;

import java.util.Scanner;

/**
 * Created by пк on 13.05.2015.
 */
public class StringUtils {


    public String div(String stroka) {

        //Пример входящей строки: “FGhj256rtyu t100..ee”
        Integer a1 = Integer.valueOf(stroka.substring(4, 7));
        Integer a2 = Integer.valueOf(stroka.substring(12, 15));
        Double result = (double) a1 / a2;

        return result.toString();
    }


    public void findWord(String text, String word, String wordForReplace) {

        String downLetters = text.toLowerCase();
        if (word.length() == 0) {
            System.out.println("Не задано слово поиска.");
            return;
        }

        //подсчет количества вхождений слова в строку
        int kolvoSlov = 0;
        int i = 0;
        do {
            i = downLetters.indexOf(word, i);
            if (i > 0) {
                i++;
                kolvoSlov++;
            }
        } while (i > 0);

        String line = downLetters.replaceAll(word, wordForReplace);
        System.out.println(line);
        System.out.println("Найдено совпадений: " + kolvoSlov);
    }


    public void findNumbers(String text) {

        Scanner txt = new Scanner(text);
        //Scanner txt = new Scanner(System.in);

        int count = 0;
        while (txt.hasNext()) {
            txt.next();
            if (txt.hasNextDouble()) {
                System.out.println(txt.nextDouble());
                count++;
            }
        }
        if (count == 0) System.out.println("Not found any double");
    }

}
