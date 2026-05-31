package ru.kubsu.contracts.enums.service.application;

/**
 * Тип банковской услуги в заявлении.
 */
public enum ServiceType {

    /** Обслуживание банковской карты. */
    CARD_SERVICE,

    /** SMS-информирование. */
    SMS_INFO,

    /** Выписка по счёту. */
    ACCOUNT_STATEMENT
}
