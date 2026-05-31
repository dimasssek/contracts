package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Тип заявления клиента.
 */
@Getter
@RequiredArgsConstructor
public enum ApplicationType {

    /** Заявление на банковский продукт. */
    PRODUCT("PRO", "application_number_seq_product"),

    /** Заявление на банковскую услугу. */
    SERVICE("SRV", "application_number_seq_service"),

    /** Заявление на изменение данных клиента. */
    PROFILE_CHANGE("PCH", "application_number_seq_profile_change"),

    /** Заявление на получение документа. */
    DOCUMENT("DOC", "application_number_seq_document"),

    /** Заявление-претензия или обращение. */
    CLAIM("CLM", "application_number_seq_claim"),

    /** Заявление на полномочия и доступы. */
    AUTHORITY("AUT", "application_number_seq_authority");

    /** Код типа в номере заявления (BSPS-{code}-{n}). */
    private final String numberCode;

    /** Имя sequence в БД для генерации номера заявления. */
    private final String sequenceName;
}
