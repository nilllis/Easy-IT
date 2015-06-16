package DomZadanie_12;

import DomZadanie_10.FileCopyUtils;

/**
 * Задача копирования файла в отдельном потоке
 */
public interface CopyFileTask extends Task {
    /**
     * Устанавливает алгоритм копирования файлов, созданный в предыдущем задании
     *
     * @param copyUtils алгоритм копирования файлов
     */
    void setFileCopyUtils(FileCopyUtils copyUtils);
}
