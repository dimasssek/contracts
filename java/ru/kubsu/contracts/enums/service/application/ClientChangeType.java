package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип изменяемых данных клиента в заявлении.
 */
@Getter
@RequiredArgsConstructor
public enum ClientChangeType {

    /** Адрес. */
    ADDRESS("Адрес"),

    /** Паспортные данные. */
    PASSPORT("Паспорт"),

    /** ФИО. */
    NAME("ФИО"),

    /** ИНН. */
    ITN("ИНН"),

    /** СНИЛС. */
    INSURANCE_NUMBER("СНИЛС");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип изменения по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип изменения
     */
    public static ClientChangeType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), ClientChangeType::getFileLabel, "Тип изменения");
    }
}
