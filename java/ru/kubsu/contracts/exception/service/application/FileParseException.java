package ru.kubsu.contracts.exception.service.application;

/**
 * Исключение: ошибка разбора файла загрузки заявлений.
 */
public class FileParseException extends ApplicationServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "FILE_PARSE_ERROR";

    /**
     * Создаёт исключение с описанием ошибки разбора.
     *
     * @param message описание ошибки
     */
    public FileParseException(String message) {
        super(ERROR_CODE, message);
    }

    /**
     * Создаёт исключение с описанием ошибки разбора и первопричиной.
     *
     * @param message описание ошибки
     * @param cause   первопричина
     */
    public FileParseException(String message, Throwable cause) {
        super(ERROR_CODE, message, cause);
    }
}
