package ru.kubsu.contracts.dto.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Страница данных с метаинформацией.
 *
 * @param <T> тип транспортного объекта
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class PageData<T> {

    /** Элементы текущей страницы. */
    private List<T> content;

    /** Метаинформация о странице. */
    private PageMetaData metaData;
}
