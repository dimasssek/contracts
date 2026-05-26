package ru.kubsu.contracts.exception.service.client;

/**
 * Исключение: клиент с такими данными уже существует.
 */
public class ClientAlreadyExistsException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "CLIENT_ALREADY_EXISTS";

    /**
     * Создаёт исключение с описанием конфликта.
     *
     * @param message описание конфликта
     */
    public ClientAlreadyExistsException(String message) {
        super(ERROR_CODE, message);
    }
}
