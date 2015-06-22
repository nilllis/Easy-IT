package DomZadanie_12.Tasks;

import DomZadanie_12.Executor.TaskExecutionFailedException;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by пк on 16.06.2015.
 */
public class TaskFindFiles extends TaskAbstract implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream out;

    public TaskFindFiles(){}

    public TaskFindFiles(String directory, String searchString, PrintStream out) {
        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File dirFile = new File(directory);
        File[] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                if (name.indexOf(searchString) != -1) {
                    return true;
                }
                return false;
            }
        });

        out.println(Thread.currentThread().getName() + " >>> найдено " + files.length + " файлов со словом '" + searchString
                + "':\n" + Arrays.toString(files));
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("directory == null");
        }

        File file = new File(directory);
        if (!file.exists()) {
            throw new FileNotFoundException("directory not exists");
        }

        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;

    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }
}
