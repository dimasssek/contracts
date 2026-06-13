package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Внутренний статус заявления с детализацией обработки.
 */
@Getter
@RequiredArgsConstructor
public enum ApplicationStatusInternal {

    /** Заявление успешно обработано. */
    APPLIED("101"),

    /** Найдено повторное заявление. */
    DUPLICATE("102"),

    /** Внутренняя ошибка при обработке. */
    INTERNAL_ERROR("104"),

    /** Заявление в очереди на обработку. */
    IN_QUEUE("105"),

    /** Не заполнены обязательные поля. */
    FLC_EMPTY_REQUIRED("201"),

    /** Дата подачи заявления больше текущей даты. */
    FLC_INVALID_SUBMISSION("202"),

    /** Клиент не найден. */
    CLIENT_NOT_FOUND("301"),

    /** ИНН в заявлении не соответствует данным клиента. */
    ITN_NOT_ACTUAL("302"),

    /** СНИЛС в заявлении не соответствует данным клиента. */
    INSURANCE_NUMBER_NOT_ACTUAL("303"),

    /** Не указан ИНН в заявлении. */
    ITN_NOT_REQUIRED("304"),

    /** Не указан СНИЛС в заявлении. */
    INSURANCE_NUMBER_NOT_REQUIRED("305");

    /** Код правила в таблице status_inform. */
    private final String code;
}
