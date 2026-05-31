package ru.kubsu.contracts.enums.service.application;

/**
 * Канал подачи заявления.
 */
public enum Channel {

    /** Отделение банка. */
    BRANCH,

    /** Интернет-банк или личный кабинет. */
    ONLINE,

    /** Мобильное приложение. */
    MOBILE,

    /** Контакт-центр. */
    PHONE,

    /** Загрузка из файла. */
    FILE
}
