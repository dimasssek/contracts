package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип запрашиваемого документа в заявлении.
 */
@Getter
@RequiredArgsConstructor
public enum DocumentType {

    /** Выписка по счёту. */
    ACCOUNT_STATEMENT("Выписка"),

    /** Справка. */
    REFERENCE("Справка"),

    /** Сертификат или подтверждающий документ. */
    CERTIFICATE("Сертификат");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип документа по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип документа
     */
    public static DocumentType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), DocumentType::getFileLabel, "Тип документа");
    }
}
