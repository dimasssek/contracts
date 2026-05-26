package ru.kubsu.contracts.exception.service.client;

import java.util.UUID;

/**
 * Исключение: внешний запрос не найден.
 */
public class ExternalRequestNotFoundException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "EXTERNAL_REQUEST_NOT_FOUND";

    /**
     * Создаёт исключение по идентификатору внешнего запроса.
     *
     * @param externalRequestId идентификатор внешнего запроса
     */
    public ExternalRequestNotFoundException(UUID externalRequestId) {
        super(ERROR_CODE, "Внешний запрос не найден: id=" + externalRequestId);
    }
}
