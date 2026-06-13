package ru.kubsu.contracts.enums.service.client;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Пол клиента.
 */
@Getter
@RequiredArgsConstructor
public enum Gender {

    /** Мужской. */
    MALE("Мужской"),

    /** Женский. */
    FEMALE("Женский"),

    /** Не определён. */
    UNDEFINED("Неопределён");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет пол по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return пол клиента
     */
    public static Gender parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), Gender::getFileLabel, "Пол");
    }
}
