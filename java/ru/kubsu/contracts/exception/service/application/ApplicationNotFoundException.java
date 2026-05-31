package ru.kubsu.contracts.exception.service.application;

import java.util.UUID;

/**
 * Исключение: заявление не найдено.
 */
public class ApplicationNotFoundException extends ApplicationServiceException {

    /** Код ошибки для парсинга. */
    public static final String ERROR_CODE = "APPLICATION_NOT_FOUND";

    /**
     * Создаёт исключение по идентификатору заявления.
     *
     * @param applicationId идентификатор заявления
     */
    public ApplicationNotFoundException(UUID applicationId) {
        super(ERROR_CODE, "Заявление не найдено: id=" + applicationId);
    }
}
