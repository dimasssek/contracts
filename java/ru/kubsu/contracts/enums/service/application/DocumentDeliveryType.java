package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Способ получения документа по заявлению.
 */
@Getter
@RequiredArgsConstructor
public enum DocumentDeliveryType {

    /** В отделении банка. */
    BRANCH("Отделение"),

    /** По электронной почте. */
    EMAIL("Email"),

    /** Почтовая доставка. */
    MAIL("Почта"),

    /** Онлайн в личном кабинете. */
    ONLINE("Онлайн");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет способ получения по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return способ получения
     */
    public static DocumentDeliveryType parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), DocumentDeliveryType::getFileLabel, "Способ получения");
    }
}
