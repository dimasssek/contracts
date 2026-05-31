package ru.kubsu.contracts.enums.service.application;

/**
 * Способ получения документа по заявлению.
 */
public enum DocumentDeliveryType {

    /** В отделении банка. */
    BRANCH,

    /** По электронной почте. */
    EMAIL,

    /** Почтовая доставка. */
    MAIL,

    /** Онлайн в личном кабинете. */
    ONLINE
}
