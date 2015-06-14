package DomZadanie_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by пк on 14.06.2015.
 */
public class ChannelFileCopyUtils implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {


//        FileChannel inChannel = new FileInputStream(source).getChannel();
//
//        inChannel.read();
    }
}
