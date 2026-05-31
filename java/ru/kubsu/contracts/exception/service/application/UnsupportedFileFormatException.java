package ru.kubsu.contracts.exception.service.application;

/**
 * Исключение: неподдерживаемый формат файла загрузки заявлений.
 */
public class UnsupportedFileFormatException extends ApplicationServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "UNSUPPORTED_FILE_FORMAT";

    /**
     * Создаёт исключение по расширению или имени файла.
     *
     * @param fileName имя файла
     */
    public UnsupportedFileFormatException(String fileName) {
        super(ERROR_CODE, "Неподдерживаемый формат файла: " + fileName);
    }
}
