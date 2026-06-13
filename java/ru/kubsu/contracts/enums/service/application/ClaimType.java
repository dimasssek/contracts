package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип претензии или обращения клиента.
 */
@Getter
@RequiredArgsConstructor
public enum ClaimType {

    /** Оспаривание операции. */
    TRANSACTION_DISPUTE("Оспаривание"),

    /** Жалоба. */
    COMPLAINT("Жалоба"),

    /** Спор или претензия. */
    DISPUTE("Претензия");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип претензии по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип претензии
     */
    public static ClaimType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), ClaimType::getFileLabel, "Тип претензии");
    }
}
