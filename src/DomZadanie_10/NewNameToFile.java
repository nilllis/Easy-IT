package DomZadanie_10;

import java.io.File;

/**
 * Created by пк on 16.06.2015.
 */
public class NewNameToFile {

    public String newNameToFile(File file) {

        String newName = file.getName();

        int numOfDot = 0;
        for (int i = 0; i < newName.length(); i++) {
            if (newName.charAt(i) == 46) {
                numOfDot = i;
                break;
            }
        }

        String fileNameWithoutExtension = newName.substring(0, numOfDot);
        newName = fileNameWithoutExtension + "(1)" + newName.substring(numOfDot);

        return file.getPath().replace(file.getName(), newName);
    }

}
