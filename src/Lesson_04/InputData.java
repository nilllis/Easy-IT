package Lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by пк on 26.05.2015.
 */
public class InputData {

    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader vvod = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите данные: ");
        str = vvod.readLine();

        System.out.println(str);
    }
}
