package ru.kubsu.contracts.enums.service.client;

/**
 * Способ формирования запроса к внешнему источнику.
 */
public enum RequestType {

    /** Запрос по выбранным клиентам из общего списка. */
    BATCH,

    /** Запрос с ручным вводом данных клиента. */
    MANUAL
}
