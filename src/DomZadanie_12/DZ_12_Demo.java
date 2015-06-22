package DomZadanie_12;

import DomZadanie_10.FileCopyUtils_Buffer;
import DomZadanie_12.Executor.TaskExecutor_Impl;
import DomZadanie_12.Storage.TasksStorage_Impl;
import DomZadanie_12.Tasks.TaskCopyFiles;
import DomZadanie_12.Tasks.TaskFindFiles;

import java.io.File;

/**
 * Created by пк on 16.06.2015.
 */
public class DZ_12_Demo {

    public static void main(String[] args) {

        File fileForCopy = new File("C:\\Users\\пк\\Desktop\\tempIdea\\testFile.ppt");


        TasksStorage_Impl storage = new TasksStorage_Impl();

        TaskCopyFiles copy1 = new TaskCopyFiles(
                fileForCopy.getPath(), fileForCopy.getParent() + "\\copy1.ppt",
                new FileCopyUtils_Buffer());
        storage.add(copy1);

        TaskCopyFiles copy2 = new TaskCopyFiles(
                fileForCopy.getPath(), fileForCopy.getParent() + "\\copy2.ppt",
                new FileCopyUtils_Buffer());
        storage.add(copy2);

        TaskCopyFiles copy3 = new TaskCopyFiles(
                fileForCopy.getPath(), fileForCopy.getParent() + "\\copy3.ppt",
                new FileCopyUtils_Buffer());
        storage.add(copy3);

        TaskCopyFiles copy4 = new TaskCopyFiles(
                fileForCopy.getPath(), fileForCopy.getParent() + "\\copy4.ppt",
                new FileCopyUtils_Buffer());
        storage.add(copy4);


        TaskFindFiles find1 = new TaskFindFiles(fileForCopy.getParent(), "copy2", System.out);
        storage.add(find1);
        TaskFindFiles find2 = new TaskFindFiles(fileForCopy.getParent(), "copy3", System.out);
        storage.add(find2);
        TaskFindFiles find3 = new TaskFindFiles(fileForCopy.getParent(), "test", System.out);
        storage.add(find3);


        TaskExecutor_Impl exe1 = new TaskExecutor_Impl(storage);
        exe1.start();
        TaskExecutor_Impl exe2 = new TaskExecutor_Impl(storage);
        exe2.start();
        TaskExecutor_Impl exe3 = new TaskExecutor_Impl(storage);
        exe3.start();
        //ISaLIVE метод

    }
}
