package DomZadanie_10;

/**
 * Created by пк on 12.06.2015.
 */
public class OneByteFileCopyUtils_Demo {


    public static void main(String[] args) {
        OneByteFileCopyUtils utils = new OneByteFileCopyUtils();

        try {
            long startTime = System.currentTimeMillis();
            utils.copyFile(
                    "C:\\Users\\пк\\Desktop\\testCopy\\src\\Lection_IO.ppt",
                    "C:\\Users\\пк\\Desktop\\testCopy\\src\\33.ppt");
            long endTime = System.currentTimeMillis();
            System.out.println("Время копирования = " + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
