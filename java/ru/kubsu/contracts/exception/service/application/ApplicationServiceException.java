package ru.kubsu.contracts.exception.service.application;

import lombok.Getter;

/**
 * Базовое исключение application-service для передачи между микросервисами.
 */
@Getter
public abstract class ApplicationServiceException extends RuntimeException {

    /** Код ошибки для парсинга на стороне других сервисов. */
    private final String code;

    /**
     * Создаёт исключение с кодом и сообщением.
     *
     * @param code    код ошибки
     * @param message описание ошибки
     */
    protected ApplicationServiceException(String code, String message) {
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
    protected ApplicationServiceException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
