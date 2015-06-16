package DomZadanie_10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by пк on 12.06.2015.
 */
public class FileCopyUtils_Demo {


    public static void main(String[] args) throws IOException {
        FileCopyTestUtils_Impl utils = new FileCopyTestUtils_Impl();

        String source = "C:\\Users\\пк\\Desktop\\tempIdea\\testFile.ppt";
        String destinationFolder = "C:\\Users\\пк\\Desktop\\tempIdea\\";

        System.out.println("Начинаем копирование");
        long startTime;
        try {
//            startTime = System.currentTimeMillis();
//            utils.createSimpleFileCopyUtils().copyFile(source, destinationFolder + "999.ppt");
//            System.out.println(utils.getClass() + " >>> Время копирования = " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            utils.createBufferedFileCopyUtils().copyFile(source, destinationFolder + "copy_Buff.ppt");
            System.out.println(utils.createBufferedFileCopyUtils().getClass() + " \t>>> Время копирования = "
                    + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            utils.createChannelsFileCopyUtils().copyFile(source, destinationFolder + "copy_Channel.ppt");
            System.out.println(utils.createChannelsFileCopyUtils().getClass() + " \t>>> Время копирования = "
                    + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            utils.createJava7CopyUtils().copyFile(source, destinationFolder + "copy_Java7.ppt");
            System.out.println(utils.createJava7CopyUtils().getClass() + " \t>>> Время копирования = "
                    + (System.currentTimeMillis() - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



