package ru.kubsu.contracts.enums.service.client;

/**
 * Статус клиента в системе.
 */
public enum ClientStatus {

    /** Актуальный клиент. */
    ACTUAL,

    /** Удалённый (soft delete) клиент. */
    DELETED
}
