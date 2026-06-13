package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Тип банковской услуги в заявлении.
 */
@Getter
@RequiredArgsConstructor
public enum ServiceType {

    /** Обслуживание банковской карты. */
    CARD_SERVICE("Карта"),

    /** SMS-информирование. */
    SMS_INFO("СМС"),

    /** Выписка по счёту. */
    ACCOUNT_STATEMENT("Выписка");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет тип услуги по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return тип услуги
     */
    public static ServiceType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), ServiceType::getFileLabel, "Тип услуги");
    }
}
