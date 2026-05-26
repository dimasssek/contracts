package ru.kubsu.contracts.exception.service.client;

import lombok.Getter;

/**
 * Базовое исключение client-service для передачи между микросервисами.
 */
@Getter
public abstract class ClientServiceException extends RuntimeException {

    /** Код ошибки для парсинга на стороне других сервисов. */
    private final String code;

    /**
     * Создаёт исключение с кодом и сообщением.
     *
     * @param code    код ошибки
     * @param message описание ошибки
     */
    protected ClientServiceException(String code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * Создаёт исключение с кодом, сообщением и причиной.
     *
     * @param code    код ошибки
     * @param message описание ошибки
     * @param cause   первопричина
     */
    protected ClientServiceException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
