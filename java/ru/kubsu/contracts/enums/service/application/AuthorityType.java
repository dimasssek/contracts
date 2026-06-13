package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип полномочия или доступа в заявлении.
 */
@Getter
@RequiredArgsConstructor
public enum AuthorityType {

    /** Доверенность на доступ к счёту. */
    POA_ACCOUNT_ACCESS("Доверенность");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип полномочия по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип полномочия
     */
    public static AuthorityType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), AuthorityType::getFileLabel, "Тип полномочия");
    }
}
