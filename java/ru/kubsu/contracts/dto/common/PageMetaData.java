package ru.kubsu.contracts.dto.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Метаинформация о странице данных.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class PageMetaData {

    /** Общее количество элементов. */
    private long totalElements;

    /** Общее количество страниц. */
    private int totalPages;

    /** Номер текущей страницы (0-based). */
    private int number;

    /** Размер страницы. */
    private int size;
}
