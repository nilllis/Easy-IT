package DomZadanie_10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by пк on 15.06.2015.
 */
public class FileCopyUtils_Java7 extends NewNameToFile implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {


        File newFile = new File(destination);
        while (newFile.exists()) {
            newFile = new File(newNameToFile(newFile));
        }
        try {
            Files.copy(new File(source).toPath(), newFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
