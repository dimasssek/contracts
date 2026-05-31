package ru.kubsu.contracts.enums.service.client;

/**
 * Тип агрегата для outbox-сообщений.
 */
public enum AggregateType {

    /** Клиент. */
    CLIENT,

    /** Внешний запрос. */
    EXTERNAL_REQUEST,

    /** Пакетный запрос. */
    BATCH_REQUEST,

    /** Запрос по клиенту. */
    REQUEST
}
