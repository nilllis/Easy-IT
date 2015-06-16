package DomZadanie_12;

import DomZadanie_10.FileCopyTestUtils_Impl;
import DomZadanie_10.FileCopyUtils;
import DomZadanie_10.FileCopyUtils_Buffer;

/**
 * Created by пк on 16.06.2015.
 */
public class DZ_12_Demo {

    public static void main(String[] args) {


        FileCopyTestUtils_Impl sposob = new FileCopyTestUtils_Impl();
        CopyFileTask_Impl obj = new CopyFileTask_Impl();

        obj.setFileCopyUtils(sposob.createBufferedFileCopyUtils());

    }
}
