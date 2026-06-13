package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип заявления клиента.
 */
@Getter
@RequiredArgsConstructor
public enum ApplicationType {

    /** Заявление на банковский продукт. */
    PRODUCT("PRO", "application_number_seq_product", "Банковский продукт"),

    /** Заявление на банковскую услугу. */
    SERVICE("SRV", "application_number_seq_service", "Банковская услуга"),

    /** Заявление на изменение данных клиента. */
    PROFILE_CHANGE("PCH", "application_number_seq_profile_change", "Изменение данных"),

    /** Заявление на получение документа. */
    DOCUMENT("DOC", "application_number_seq_document", "Получение документа"),

    /** Заявление-претензия или обращение. */
    CLAIM("CLM", "application_number_seq_claim", "Претензия"),

    /** Заявление на полномочия и доступы. */
    AUTHORITY("AUT", "application_number_seq_authority", "Полномочия");

    /** Код типа в номере заявления (BSPS-{code}-{n}). */
    private final String numberCode;

    /** Имя sequence в БД для генерации номера заявления. */
    private final String sequenceName;

    /** Название типа заявления в первой строке файла загрузки. */
    private final String fileTypeLabel;

    /**
     * Определяет тип заявления по первой строке файла загрузки.
     *
     * @param value текст первой строки
     * @return тип заявления
     */
    public static ApplicationType parseFileTypeLabel(String value) {
        String trimmed = value == null ? "" : value.trim();
        for (ApplicationType type : values()) {
            if (type.fileTypeLabel.equals(trimmed)) {
                return type;
            }
        }
        throw new IllegalArgumentException("неизвестный тип заявления «" + trimmed + "». Ожидается: "
                + FileLabelEnumParser.expectedLabels(values(), ApplicationType::getFileTypeLabel));
    }
}
