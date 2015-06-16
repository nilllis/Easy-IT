package DomZadanie_10;

/**
 * Created by пк on 14.06.2015.
 */
public class FileCopyTestUtils_Impl implements FileCopyTestUtils {

    @Override
    public FileCopyUtils createSimpleFileCopyUtils() { return new FileCopyUtils_OneByte(); }

    @Override
    public FileCopyUtils createBufferedFileCopyUtils() {
        return new FileCopyUtils_Buffer();
    }

    @Override
    public FileCopyUtils createChannelsFileCopyUtils() {
        return new FileCopyUtils_Channel();
    }

    @Override
    public FileCopyUtils createJava7CopyUtils() {
        return new FileCopyUtils_Java7();
    }
}
