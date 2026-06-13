package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип действия по банковской услуге в заявлении.
 */
@Getter
@RequiredArgsConstructor
public enum ServiceActionType {

    /** Подключение или запрос услуги. */
    REQUEST("Запрос"),

    /** Отключение услуги. */
    DISABLE("Отключение"),

    /** Изменение параметров услуги. */
    CHANGE("Изменение");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип действия по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип действия
     */
    public static ServiceActionType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), ServiceActionType::getFileLabel, "Действие");
    }
}
