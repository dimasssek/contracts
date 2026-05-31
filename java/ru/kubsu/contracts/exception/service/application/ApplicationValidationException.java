package ru.kubsu.contracts.exception.service.application;

/**
 * Исключение: ошибка бизнес-валидации заявления.
 */
public class ApplicationValidationException extends ApplicationServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "APPLICATION_VALIDATION_ERROR";

    /**
     * Создаёт исключение с описанием ошибки валидации.
     *
     * @param message описание ошибки
     */
    public ApplicationValidationException(String message) {
        super(ERROR_CODE, message);
    }
}
