package ru.kubsu.contracts.enums.service.application;

/**
 * Тип запрашиваемого документа в заявлении.
 */
public enum DocumentType {

    /** Выписка по счёту. */
    ACCOUNT_STATEMENT,

    /** Справка. */
    REFERENCE,

    /** Сертификат или подтверждающий документ. */
    CERTIFICATE
}
