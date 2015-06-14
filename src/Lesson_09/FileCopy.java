package Lesson_09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by пк on 12.06.2015.
 */
public class FileCopy {

    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\пк\\IdeaProjects\\Hello 1\\src\\Lesson_09\\erste.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\пк\\IdeaProjects\\Hello 1\\src\\Lesson_09\\zweite.jpg"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }

    }

}
