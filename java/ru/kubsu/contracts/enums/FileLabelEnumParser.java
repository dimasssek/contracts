package ru.kubsu.contracts.enums;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Разбор enum-значений по русской метке из файла загрузки.
 */
public final class FileLabelEnumParser {

    private FileLabelEnumParser() {
    }

    /**
     * Находит enum-константу по русской метке из файла.
     *
     * @param value      значение из файла
     * @param values     все константы enum
     * @param labelFn    функция получения метки
     * @param fieldName  имя поля для сообщения об ошибке
     * @param <E>        тип enum
     * @return найденная константа
     */
    public static <E extends Enum<E>> E parse(String value,
                                              E[] values,
                                              Function<E, String> labelFn,
                                              String fieldName) {
        String trimmed = normalize(value);
        for (E item : values) {
            if (labelFn.apply(item).equals(trimmed)) {
                return item;
            }
        }
        throw new IllegalArgumentException(formatUnknownMessage(fieldName, trimmed, values, labelFn));
    }

    /**
     * Возвращает список допустимых меток через запятую.
     *
     * @param values  все константы enum
     * @param labelFn функция получения метки
     * @param <E>     тип enum
     * @return строка допустимых значений
     */
    public static <E extends Enum<E>> String expectedLabels(E[] values, Function<E, String> labelFn) {
        return Arrays.stream(values)
                .map(labelFn)
                .collect(Collectors.joining(", "));
    }

    /**
     * Формирует сообщение об ошибке распознавания enum.
     *
     * @param fieldName имя поля
     * @param value     фактическое значение
     * @param values    все константы enum
     * @param labelFn   функция получения метки
     * @param <E>       тип enum
     * @return текст ошибки
     */
    public static <E extends Enum<E>> String formatUnknownMessage(String fieldName,
                                                                  String value,
                                                                  E[] values,
                                                                  Function<E, String> labelFn) {
        return "не удалось распознать значение «" + value + "» в поле «" + fieldName
                + "» (ожидается: " + expectedLabels(values, labelFn) + ")";
    }

    private static String normalize(String value) {
        return value == null ? "" : value.trim();
    }
}
