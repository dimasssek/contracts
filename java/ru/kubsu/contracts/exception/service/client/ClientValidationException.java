package ru.kubsu.contracts.exception.service.client;

/**
 * Исключение: ошибка бизнес-валидации данных клиента.
 */
public class ClientValidationException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "CLIENT_VALIDATION_ERROR";

    /**
     * Создаёт исключение с описанием ошибки валидации.
     *
     * @param message описание ошибки
     */
    public ClientValidationException(String message) {
        super(ERROR_CODE, message);
    }
}
