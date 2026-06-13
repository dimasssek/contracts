package ru.kubsu.contracts.enums.service.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.kubsu.contracts.enums.FileLabelEnumParser;

/**
 * Категория банковского продукта.
 */
@Getter
@RequiredArgsConstructor
public enum ProductCategory {

    /** Кредитный продукт. */
    CREDIT("Кредит"),

    /** Депозитный продукт. */
    DEPOSIT("Депозит"),

    /** Карточный продукт. */
    CARD("Карта"),

    /** Страховой продукт. */
    INSURANCE("Страхование");

    /** Значение в файле загрузки. */
    private final String fileLabel;

    /**
     * Определяет категорию продукта по значению из файла загрузки.
     *
     * @param value текст из файла
     * @return категория продукта
     */
    public static ProductCategory parseFileLabel(String value) {
        return FileLabelEnumParser.parse(value, values(), ProductCategory::getFileLabel, "Категория продукта");
    }
}
