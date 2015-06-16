package DomZadanie_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by пк on 14.06.2015.
 */
public class FileCopyUtils_Channel extends NewNameToFile implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {


        File file = new File(destination);
        while (file.exists()) {
            file = new File(newNameToFile(file));
        }

        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel = new FileInputStream(source).getChannel();
            outChannel = new FileOutputStream(file.getPath()).getChannel();

            ByteBuffer buff = ByteBuffer.allocate(1024);

            while (inChannel.read(buff) != -1) {
                buff.flip();
                outChannel.write(buff);
                buff.clear();
            }
        } catch (Exception e) {
            new FileCopyFailedException("невозможно создать канал копирования");
        }
    }
}
