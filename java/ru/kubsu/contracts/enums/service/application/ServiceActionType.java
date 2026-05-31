package ru.kubsu.contracts.enums.service.application;

/**
 * Тип действия по банковской услуге в заявлении.
 */
public enum ServiceActionType {

    /** Подключение или запрос услуги. */
    REQUEST,

    /** Отключение услуги. */
    DISABLE,

    /** Изменение параметров услуги. */
    CHANGE
}
