package ru.kubsu.contracts.enums.service.application;

/**
 * Тип события, сохраняемого в outbox для report-service.
 */
public enum OutboxEventType {

    /** Заявление создано. */
    APPLICATION_CREATED,

    /** Заявление обновлено (включая soft delete через deleted = true). */
    APPLICATION_UPDATED,

    /** Продуктовое заявление создано. */
    PRODUCT_APPLICATION_CREATED,

    /** Продуктовое заявление обновлено. */
    PRODUCT_APPLICATION_UPDATED,

    /** Заявление на изменение профиля создано. */
    PROFILE_CHANGE_APPLICATION_CREATED,

    /** Заявление на изменение профиля обновлено. */
    PROFILE_CHANGE_APPLICATION_UPDATED,

    /** Заявление на банковскую услугу создано. */
    SERVICE_APPLICATION_CREATED,

    /** Заявление на банковскую услугу обновлено. */
    SERVICE_APPLICATION_UPDATED,

    /** Заявление на получение документа создано. */
    DOCUMENT_APPLICATION_CREATED,

    /** Заявление на получение документа обновлено. */
    DOCUMENT_APPLICATION_UPDATED,

    /** Заявление-претензия создано. */
    CLAIM_APPLICATION_CREATED,

    /** Заявление-претензия обновлено. */
    CLAIM_APPLICATION_UPDATED,

    /** Заявление на полномочия создано. */
    AUTHORITY_APPLICATION_CREATED,

    /** Заявление на полномочия обновлено. */
    AUTHORITY_APPLICATION_UPDATED
}
