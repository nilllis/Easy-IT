package DomZadanie_12;

import DomZadanie_10.FileCopyFailedException;
import DomZadanie_10.FileCopyUtils;

/**
 * Created by пк on 16.06.2015.
 */
public class CopyFileTask_Impl extends Task_Impl implements CopyFileTask {
    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        try {
            copyUtils.copyFile("C:\\Users\\пк\\Desktop\\tempIdea\\testFile.ppt", "C:\\Users\\пк\\Desktop\\tempIdea\\COPY-COPY.ppt");
        } catch (FileCopyFailedException e) {
            System.out.println("Ошибка копирования в " + this.getClass().toString());
        }
    }
}

