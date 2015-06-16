package DomZadanie_10;

import java.io.*;

/**
 * Created by пк on 14.06.2015.
 */
public class FileCopyUtils_Buffer extends NewNameToFile implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {


        File file = new File(destination);
        while (file.exists()) {
            file = new File(newNameToFile(file));
        }

        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(source));
            out = new BufferedOutputStream(new FileOutputStream(file.getPath()));
            int c = 0;
            while (true) {
                c = in.read();
                if (c != -1)
                    out.write(c);
                else
                    break;
            }
        } catch (Exception e1) {
            throw new FileCopyFailedException("ошибка  копирования в " + this.getClass().toString());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                    out.close(); //закрываем поток записи (обязательно!)
                }
            } catch (IOException i) {
                throw new FileCopyFailedException("ошибка закрытия потоков в " + this.getClass().toString());
            }

        }
    }
}