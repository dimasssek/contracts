package ru.kubsu.contracts.exception.service.client;

import java.util.UUID;

/**
 * Исключение: запрос (request) не найден.
 */
public class RequestNotFoundException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "REQUEST_NOT_FOUND";

    /**
     * Создаёт исключение по идентификатору запроса.
     *
     * @param requestId идентификатор запроса
     */
    public RequestNotFoundException(UUID requestId) {
        super(ERROR_CODE, "Запрос не найден: id=" + requestId);
    }
}
