package ru.kubsu.contracts.exception.service.client;

import java.util.UUID;

/**
 * Исключение: клиент не найден.
 */
public class ClientNotFoundException extends ClientServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "CLIENT_NOT_FOUND";

    /**
     * Создаёт исключение по идентификатору клиента.
     *
     * @param clientId идентификатор клиента
     */
    public ClientNotFoundException(UUID clientId) {
        super(ERROR_CODE, "Клиент не найден: id=" + clientId);
    }
}
