package ru.kubsu.contracts.exception.service.client;

import java.util.UUID;

/**
 * Исключение: пакетный запрос не найден.
 */
public class BatchRequestNotFoundException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "BATCH_REQUEST_NOT_FOUND";

    /**
     * Создаёт исключение по идентификатору пакетного запроса.
     *
     * @param batchRequestId идентификатор пакетного запроса
     */
    public BatchRequestNotFoundException(UUID batchRequestId) {
        super(ERROR_CODE, "Пакетный запрос не найден: id=" + batchRequestId);
    }
}
