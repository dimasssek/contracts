package ru.kubsu.contracts.enums.service.client;

/**
 * Статус записи outbox-сообщения.
 */
public enum OutboxStatus {

    /** Сообщение ожидает отправки. */
    NEW,

    /** Сообщение успешно отправлено в брокер. */
    SENT,

    /** Отправка сообщения завершилась ошибкой. */
    FAILED
}
