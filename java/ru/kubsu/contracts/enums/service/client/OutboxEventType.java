package ru.kubsu.contracts.enums.service.client;

/**
 * Тип события, сохраняемого в outbox.
 */
public enum OutboxEventType {

    /** Клиент создан. */
    CLIENT_CREATED,

    /** Данные клиента обновлены. */
    CLIENT_UPDATED,

    /** Клиент удалён (soft delete). */
    CLIENT_DELETED,

    /** Пакетный запрос отправлен во внешний источник. */
    EXTERNAL_REQUEST_SENT
}
