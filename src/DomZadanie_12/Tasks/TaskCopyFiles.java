package DomZadanie_12.Tasks;

import DomZadanie_10.*;
import DomZadanie_12.Executor.TaskExecutionFailedException;

/**
 * Created by пк on 16.06.2015.
 */
public class TaskCopyFiles extends TaskAbstract implements CopyFileTask {
    private String source;
    private String destination;
    private FileCopyUtils sposobCopy = null;


    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            sposobCopy.copyFile(getSource(), getDestination());
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException("ошибка копирования " + e.getMessage());
        }
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.sposobCopy = copyUtils;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TaskCopyFiles() {
    }
    public TaskCopyFiles(String source, String destination, FileCopyUtils copyUtils){
        this.source = source;
        this.destination = destination;
        sposobCopy = copyUtils;
    }
}
