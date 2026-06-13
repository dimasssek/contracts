package ru.kubsu.contracts.enums.service.application;

/**
 * Тип агрегата для outbox-сообщений report-service.
 */
public enum AggregateType {

    /** Базовое заявление. */
    APPLICATION,

    /** Заявление на банковский продукт. */
    PRODUCT_APPLICATION,

    /** Заявление на изменение данных клиента. */
    PROFILE_CHANGE_APPLICATION,

    /** Заявление на банковскую услугу. */
    SERVICE_APPLICATION,

    /** Заявление на получение документа. */
    DOCUMENT_APPLICATION,

    /** Заявление-претензия или обращение. */
    CLAIM_APPLICATION,

    /** Заявление на полномочия и доступы. */
    AUTHORITY_APPLICATION
}
